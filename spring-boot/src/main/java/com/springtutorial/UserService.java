package com.springtutorial;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;

	public List<UserDetails> getAll() {
		List<UserDetails> list = new ArrayList<UserDetails>();
		userRepo.findAll().forEach(list::add);
		return list;
	}

	public void delete(String id) {
		userRepo.delete(id);
	}
	
	public UserDetails adduser(UserDetails userDetails) {
		return userRepo.save(userDetails);
	}

}
