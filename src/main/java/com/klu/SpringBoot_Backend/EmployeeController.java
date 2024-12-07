package com.klu.SpringBoot_Backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository er;
	
	@PostMapping("/add")
	public void addemp(@RequestBody Employee ob) {
		er.save(ob);
		
		@GetMapping("/viewall")
		public List<Employee> getaallemp(){
			return er.findAll();
			
		}
	}

}
