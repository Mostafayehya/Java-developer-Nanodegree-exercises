package com.udacity.DogRestApi.web;

import com.udacity.DogRestApi.service.DogService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ApiResponses(value = {
        @ApiResponse(code=400, message = "This is a bad request, please follow the API documentation for the proper request format."),
        @ApiResponse(code=401, message = "Due to security constraints, your access request cannot be authorized. "),
        @ApiResponse(code=500, message = "The server is down. Please make sure that the Location microservice is running.")
})
public class DogController {

    private DogService dogService;

    @Autowired
    public void setDogService(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping("/dogs/breed")
    public ResponseEntity<List<String>> getDogBreeds() {
        return new ResponseEntity<List<String>>(dogService.retrieveDogBreed(), HttpStatus.OK);

    }

    @GetMapping("/{id}/breed")
    public ResponseEntity<String> getDogBreedsById(@PathVariable Long id) {
        return new ResponseEntity<String>(dogService.retrieveDogBreedById(id), HttpStatus.OK);
    }

    @GetMapping("/dogs")
    public ResponseEntity<List<String>> getDogNames() {
        return new ResponseEntity<List<String>>(dogService.retrieveDogNames(), HttpStatus.OK);
    }

}
