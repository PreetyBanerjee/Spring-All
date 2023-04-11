package com.stl.preety.telecomapp.jwt;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.stl.preety.telecomapp.model.User;
import com.stl.preety.telecomapp.repository.UserRepository;

@Service
public class SignupDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User model=repo.findByMobileNo(username);
		return new SignupDetails(model);
	}


	

}
