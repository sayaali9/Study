package com.cjc.main.serviceI;

import java.util.List;

import com.cjc.main.model.Home;

public interface ServiceI {

	public Home saveData(Home h);

	public List<Home> getData();

	public Home getsingleData(int hid);

	public Home updateData(Home h);

	public void deleteData(int hid);

	

}
