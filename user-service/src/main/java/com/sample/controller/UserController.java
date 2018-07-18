package com.sample.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.models.User;
import com.sample.service.IUserService;
import com.sample.util.RestEndpointMapper;

@RestController
@RequestMapping(path = RestEndpointMapper.USERS, produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
	
	private static Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	IUserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> getUsers(){
		logger.info("In GET Users");
		List<User> users = userService.getUsers();
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<User> postUsers(@Valid @RequestBody User userRequest){
		logger.info("In POST Users");
		User user = userService.postUsers(userRequest);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
}
