package com.stl.preety.telecomapp.service;

import java.util.List;

import com.stl.preety.telecomapp.model.User;

public interface UserService {
	
	public User getByPhoneNo(String phoneNo);
	
	public User saveUser(User user);
	
	public List<User> getListByCity(String city);

	public User getById(Integer id);
	
}
                                                     




