package com.userportal.userportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.userportal.userportal.entity.User;
import com.userportal.userportal.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	@CrossOrigin(origins = "http://localhost:8080")
	public List<User> getUsers() {
		return userService.listAllUser();
	}

	@PostMapping("/user")
	@CrossOrigin(origins = "http://localhost:8080")
	public void saveUser(@RequestBody User user) {
		userService.saveUser(user);
	}

	@PutMapping("/users")
	@CrossOrigin(origins = "http://localhost:8080")
	public void updateUsers(@RequestBody List<User> users) {
		userService.updateUser(users);
	}

	@DeleteMapping("/user/{id}")
	@CrossOrigin(origins = "http://localhost:8080")
	public void delete(@PathVariable Integer id) {
		userService.deleteUser(id);
	}

}
