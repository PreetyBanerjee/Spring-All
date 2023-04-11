package com.stl.preety.telecomapp.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stl.preety.telecomapp.model.User;
import com.stl.preety.telecomapp.repository.UserRepository;
import com.stl.preety.telecomapp.service.UserService;


@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/save")
	public ResponseEntity<User> createUser(@RequestBody User user) throws Exception {
		User users = userService.saveUser(user);
		return ResponseEntity.ok().body(users);
	}

//	@PostMapping("/savepolicy")
//	public ResponseEntity<User> createUserPolicy(@RequestBody User user) throws Exception {
//		User users = userService.saveUser(user);
//		return ResponseEntity.ok().body(users);
//
//	}
//
//	//Design Rest API which gives the list of city user
//	@GetMapping("/getcity/{city}")
//	public ResponseEntity<List<User>> getUserByCity(@PathVariable("city") String city) {
//		List<User> user = userService.getListByCity(city);
//		return ResponseEntity.ok().body(user);
//	}
	
	@GetMapping("{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") Integer id) {
		User user = userService.getById(id);
		return ResponseEntity.ok().body(user);
	}
	
	@GetMapping("/all")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}		
		
	//get single user details by phone_no handler
	@GetMapping("{phone_no}")
	public ResponseEntity<User> getBook(@PathVariable("phone_no") String phone_no) {
		User user=userService.getByPhoneNo(phone_no);
		if(user==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(user));
	}
	
	

}
