package com.axelor.restdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.axelor.restdemo.domain.Contact;
import com.axelor.restdemo.domain.Person;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;

@Singleton
public class MyServiceImpl implements MyService{
	@Inject
	Provider<EntityManager> em;
	
	
	
	@Transactional
	@Override
	public void insert(String name,long contact) {
		EntityManager entityManager = em.get();
	System.out.println(name);
	Person p;

	Contact ct = new Contact();

//	List<Person> personList = entityManager.createQuery("from Person where name ='" + name + "'").getResultList();
//
	List<Contact> list1 = new ArrayList<Contact>();
//	list1.add(ct);
//	if (personList.isEmpty()) {
		p = new Person();
		p.setName(name);
		ct.setCno(contact);
		
		list1.add(ct);

		p.setLaps(list1);

		entityManager.persist(p);
		entityManager.close();

//	} else {
//
//		p = personList.get(0);
//		System.out.print(p);
//		ct.setCno(contact);
//	
//		p.getLaps().add(ct);
//		entityManager.persist(p);
//	}
	}

	
	@Transactional
	@Override
	public List<Person> showAllEmployees() {
		EntityManager entityManager = em.get();
		List<Person> personList = new ArrayList<Person>();

		
		//Query query 
		personList= entityManager.createQuery("from Person").getResultList();
		//personList = query.getResultList();

		//entityManager.close();
		return personList;
	}
////
	@Transactional
	@Override
	public List<Person> update(int id,String name,long contact,int cid) {
		EntityManager entityManager = em.get();
		Person person = new Person();
		
		person = entityManager.find(Person.class, id);
		
		person.setName(name);
		
		Contact contact1 = new Contact();
		
		contact1 = entityManager.find(Contact.class, cid);
		
		contact1.setCno(contact);
		contact1.setPerson(person);
		entityManager.persist(contact1);
		entityManager.persist(person);
		
		List<Person> personList = new ArrayList();
		Query query =entityManager.createQuery("From Person");
		personList = query.getResultList();

		
		return personList;
	}
////
	@Transactional
	@Override
	public List<Person> delete(int id ,int cid) {
		EntityManager entityManager = em.get();
//		List<Employee> a = em.createQuery("select from Employee where id ='" + id + "'").getResultList();
	
		
	Person person = entityManager.find(Person.class, id);
	
	entityManager.remove(person);
	
	Contact contact = new Contact();
	
	entityManager.remove(contact);
		
		List<Person> personList = new ArrayList();
		Query query = entityManager.createQuery("From Person");
		personList = query.getResultList();
        
	
		return personList;
	}
	
	@Transactional
	@Override
	public List<Person> search(String name)
	{
		EntityManager entityManager = em.get();
		List<Person> personList = entityManager.createQuery("from Person where name ='" + name + "'").getResultList();
		
		
		return personList;
	}
//	@Transactional
//	@Override
//	public void doStuff(String name, String brand) {
//
//		em.getTransaction().begin();
//
//		System.out.println("name of the owner" + name);
//		Human h = new Human();
//		Laptop lp = new Laptop();
//
//		List<Human> humanList = em.createQuery("select from Human where hname ='" + name + "'").getResultList();
//		List<Laptop> laptopList = em.createQuery("select from Laptop where lbrand ='" + brand + "'").getResultList();
//
//		
//		em.getTransaction().commit();
//
//	}
//
//	@Transactional
//	@Override
//	public List<Human> fetch() {
//
//		em.getTransaction().begin();
//
//	
//		Human h = new Human();
//		
//
//		List<Human> humanList = em.createQuery("Select h.hname from Human h").getResultList();
//	
//		
//        System.out.println(humanList);
//		
//		em.getTransaction().commit();
//       return humanList;
//		
//
//	}
}

