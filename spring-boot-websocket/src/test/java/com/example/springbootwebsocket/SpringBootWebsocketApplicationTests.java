package com.example.springbootwebsocket;

import com.example.springbootwebsocket.controller.UserController;
import com.example.springbootwebsocket.model.User;
import com.example.springbootwebsocket.model.UserResponse;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootWebsocketApplicationTests {

	@Test
	public void testUserResponse(){
		UserController userController = new UserController();
		UserResponse userResponse = userController.getUser(new User("Jemmy"));
		Assert.assertEquals(userResponse.getContent(),"hello, Jemmy");
	}
	@Test
	void contextLoads() {
	}

}
