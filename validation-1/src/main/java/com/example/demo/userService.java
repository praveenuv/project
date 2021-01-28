package com.example.demo;

import java.util.List;

public interface userService {
	
	public List<User> getAllProducts();
	public void deleteUser(Integer id);
	public User getProductById(Integer id);

}
