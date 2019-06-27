package com.axelor.restdemo.service;

import java.util.List;

import com.axelor.restdemo.domain.Person;
import com.google.inject.ImplementedBy;



public interface MyService {
	
	public void insert (String name,long contact);
	public List<Person> showAllEmployees();
	public List<Person> update(int id,String name,long contact,int cid);
	public List<Person> delete(int id,int cid);
//    public List<Person> search(String name);
}
