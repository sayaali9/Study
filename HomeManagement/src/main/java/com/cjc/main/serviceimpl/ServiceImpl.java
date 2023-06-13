package com.cjc.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Home;
import com.cjc.main.repository.repository;
import com.cjc.main.serviceI.ServiceI;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	private repository repo;

	@Override
	public Home saveData(Home h) {
	
		Home h1=repo.save(h);
		return h1;
	}

	@Override
	public List<Home> getData() {
		
		List<Home>  h1=repo.findAll();
		return h1;
	}

	@Override
	public Home getsingleData(int hid) {
		
		Optional<Home> h1=repo.findById(hid);
		return h1.get();
	}

	@Override
	public Home updateData(Home h) {
		
		Home h1=repo.save(h);
		return h1;
	}

	@Override
	public void deleteData(int hid) {
		
		repo.deleteById(hid);
		
	}

	
}
