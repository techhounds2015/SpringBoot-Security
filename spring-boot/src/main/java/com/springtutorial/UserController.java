package com.springtutorial;

import java.util.List;

import javax.management.InvalidApplicationException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("/getAll")
	List<UserDetails> getAll() {
		return userService.getAll();
	}
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public UserDetails addUser(@RequestBody UserDetails userDetails) {		
		if (userDetails != null) {
			userDetails = userService.adduser(userDetails);
			return userDetails;
		}
		return null;
	}

}
