package com.example.demo;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userImp implements userService {

	@Autowired
	private userRepo repo;
	
	@Override
	@Transactional
	public List<User> getAllProducts() {
		
		return repo.findAll();
	}
	
	@Transactional
	public void deleteUser(Integer id) {
		repo.deleteById(id);
	}
	
	@Transactional
	public User getProductById(Integer id) {
		
	return repo.getProductById(id);
	}


}
