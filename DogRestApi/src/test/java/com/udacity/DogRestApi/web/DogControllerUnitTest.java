package com.udacity.DogRestApi.web;

import com.udacity.DogRestApi.service.DogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.MockMvcAutoConfiguration;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

 // Todo allow tests to bypass the security authentication and authorization to be able to test it
@RunWith(SpringRunner.class)
@WebMvcTest(DogController.class) // To link this test to the tested artifact\class.
public class DogControllerUnitTest {

    // I think this is used to moc the whole parts of the MVC app
    @Autowired
    private MockMvc mockMvc;

    // Why not using the DogImpl class instead?
    // Maybe to gurantee that it will work if we change the DogServiceImpl
    @MockBean
    DogService dogService;

    @Test
    public void getDogBreeds() throws Exception{
        mockMvc.perform(get("/dogs/breed"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json("[]"));
        verify(dogService,times(1)).retrieveDogBreed();
    }

    @Test
    public void getDogBreedById() throws Exception {
        mockMvc.perform(get("/{id}/breed",1))
                .andExpect(status().isOk());

        verify(dogService,times(1)).retrieveDogBreedById(1L);
    }


}
