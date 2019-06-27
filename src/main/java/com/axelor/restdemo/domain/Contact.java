package com.axelor.restdemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.jboss.resteasy.annotations.jaxrs.FormParam;

@Entity 
public class Contact {
	

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	@FormParam  ("contact")
	private long cno;
	
	@ManyToOne
	private Person person;
	

	

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public long getCno() {
		return cno;
	}

	public void setCno(long cno) {
		this.cno = cno;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Contact [cid=" + cid + ", cno=" + cno + ", person=" + person + "]";
	}

	
}
