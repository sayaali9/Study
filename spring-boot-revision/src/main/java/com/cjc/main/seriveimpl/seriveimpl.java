package com.cjc.main.seriveimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Employee;
import com.cjc.main.repository.repository;
import com.cjc.main.service.serviceI;

@Service
public class seriveimpl implements serviceI{

   @Autowired
   private repository repo;

@Override
public Employee savedata(Employee e) {
	Employee s1 = repo.save(e);
	return s1;
}

@Override
public List<Employee> getA() {
	List<Employee> f1 = repo.findAll();
	return f1;
}

@Override
public Employee gets(int eid) {
	Optional<Employee> f1 = repo.findById(eid);
	return f1.get();
}

@Override
public Employee updatedata(Employee e) {
	Employee s1 = repo.save(e);
	return s1;
}

@Override
public void deletedata(int eid) {
 repo.deleteById(eid);
	
}

@Override
public Employee gets(String name) {
	Employee e1=repo.findByName(name);
	return e1;
}



}
