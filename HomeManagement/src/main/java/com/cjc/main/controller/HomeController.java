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

import com.cjc.main.model.Home;
import com.cjc.main.serviceI.ServiceI;

@RestController
public class HomeController {

	@Autowired
	private ServiceI usi;
	
	@PostMapping("/save")
	public String saveData(@RequestBody Home h)
	{
		Home h1=usi.saveData(h);
		
		return "Data saved successfully";
		
	}
	@GetMapping("/retrive")
	public List<Home> getData()
	{
		List<Home> h1=usi.getData();
		
		return h1;
	}
	@GetMapping("/SingleDataretrive/{hid}")
	public Home getsingleData(@PathVariable int hid)
	{
		Home h1=usi.getsingleData(hid);
		
		return h1;
	}
	
	@PutMapping("/update")
	public String updateData(@RequestBody Home h)
	{
		Home h1=usi.updateData(h);
		
		return "update data successfully";
	}
	@DeleteMapping("/delete/{hid}")
	public String deletedata(@PathVariable int hid)
	{
	usi.deleteData(hid);
		
		return "delete data successfully";
	}
	
}
