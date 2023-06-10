package com.cjc.main.service;

import java.util.List;

import com.cjc.main.model.Employee;

public interface serviceI {

	Employee savedata(Employee e);

	List<Employee> getA();

	Employee gets(int eid);

	Employee updatedata(Employee e);

	void deletedata(int eid);

	Employee gets(String name);

	
	




}
