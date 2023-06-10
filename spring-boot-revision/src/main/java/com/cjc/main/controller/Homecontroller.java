package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Employee;
import com.cjc.main.service.serviceI;

 @RestController
 public class Homecontroller {
	 
    	@Autowired
    	private serviceI usi;
    	
    	@PostMapping("/save")
    	public String saveData(@RequestBody Employee e)
    	{
    		Employee e1=usi.savedata(e);
    		return "saved";
    	}
    	@GetMapping("/getA")
    	public List<Employee> getAll()
    	{
    		List<Employee> e1=usi.getA();
    		return e1;
    	}
    	
    	@GetMapping("/gets/{eid}")
    	public Employee getsingle(@PathVariable int eid)
    	{
    		Employee e1=usi.gets(eid);
    		return e1;
    	}
    	@GetMapping("/getn/{name}")
    	public Employee getname(@PathVariable String name)
    	{
    		Employee e1=usi.gets(name);
    		return e1;
    	}
    	@PutMapping("/update")
    	public String updateData(@RequestBody Employee e)
    	{
    		Employee e1=usi.updatedata(e);
    		return "update data successfully";
    	}
    	
    	@DeleteMapping("/delete/{eid}")
    	public String deleteData(@PathVariable int eid)
    	{
    		usi.deletedata(eid);
    		return "delete data sucessfully";
    	}
}
