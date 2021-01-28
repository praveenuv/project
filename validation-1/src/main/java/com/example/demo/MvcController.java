package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;





 
@Controller
public class MvcController {
	
	@Autowired
	private userRepo repo;


	@Autowired
	private userImp ser;



   
    @RequestMapping("/")
    public String home() {
        System.out.println("Going home...");
        return "index";
    }
    @RequestMapping("/register")
    public String showForm(Model model) {
        User user = new User();
        List<String> professionList = Arrays.asList("Developer", "Designer", "Tester");
        
        model.addAttribute("user", user);
        model.addAttribute("professionList", professionList);
         
        return "register_form";
    }
    
	@RequestMapping("/register1")
	public String submitForm(@ModelAttribute("user") User user,Model map) {

		repo.save(user);

		

		System.out.println(user);
	
		
		List<User> s=ser.getAllProducts();
   	 map.addAttribute("list", s);

		return "Data";
	}
    @RequestMapping("/all")
  public  String showAll(Model map) {
    	
    	List<User> s=ser.getAllProducts();
    	 map.addAttribute("list", s);
    	return "Data";
    }
    
    @RequestMapping("/delete")
    public String remove(@RequestParam Integer id) {
    //delete row based on ID
    ser.deleteUser(id);
    //response.sendRedirect
    return "listusers";
    }
    
    @RequestMapping(value="edit")
    public String showEdit(@RequestParam Integer id, Model map)
    {
    //Load Objet from DB
    User p =ser.getProductById(id);
    //From BACKING OBJECT
    map.addAttribute("product", p);
    map.addAttribute("Mode", "EDIT");
    return "Register";
    }


    
    
}