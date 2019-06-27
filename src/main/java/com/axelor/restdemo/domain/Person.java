package com.axelor.restdemo.domain;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.jboss.resteasy.annotations.jaxrs.FormParam;


@Entity 
public class Person {
	@Id 
	@GeneratedValue
	private int id;
	
	@FormParam ("name")
	private String name;
	
//	@FormParam ("contact")
//	private long contact;
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType .ALL)@JoinColumn (name = "PERSON_ID")
    private List<Contact> laps ;
	
	

	public Person() {}
	
	public Person(String name, List<Contact> laps) {
		super();
		this.name = name;
		this.laps = laps;
	}

//	public Person(String name, long contact) {
//		super();
//		this.name = name;
////		this.contact = contact;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Contact> getLaps() {
		return laps;
	}

	public void setLaps(List<Contact> laps) {
		this.laps = laps;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", laps=" + laps + "]";
	}

	
//	public long getContact() {
//		return contact;
//	}
//
//	public void setContact(long contact) {
//		this.contact = contact;
//	}
	
	

}
