package com.axelor.restdemo.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

import org.jboss.resteasy.annotations.jaxrs.FormParam;

import com.axelor.restdemo.domain.Contact;
import com.axelor.restdemo.domain.Person;
import com.axelor.restdemo.service.MyService;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
@Path("/")
public class Controller {
	@Inject
	MyService myservice;

	@GET
	public void display(@Context HttpServletRequest request, @Context HttpServletResponse response)
			throws ServletException, IOException {
		{

			List<Person> personList = myservice.showAllEmployees();
			request.setAttribute("perlist", personList);
			request.getRequestDispatcher("/index.jsp").forward(request, response);

		}
	}

	@POST
	@Path("/insert")
	public void insert(@FormParam("name") String name, @FormParam("contact") long contact,
			@Context HttpServletRequest request, @Context HttpServletResponse response)
			throws ServletException, IOException {
		{
			System.out.println(name);
			System.out.println(contact);
			myservice.insert(name, contact);
			
			response.sendRedirect(request.getContextPath());
			//request.getRequestDispatcher("/index.jsp").forward(request, response);

		}
	}

	@POST
	@Path("/update")
	public void update(@Context HttpServletRequest request, @Context HttpServletResponse response)
			throws ServletException, IOException {

		String list2 = request.getParameter("ubutton");

		if (list2.equals("update")) {
			System.out.println("kjoihrg");
			String names = request.getParameter("name");
			String con = request.getParameter("contact");
			int contacts = Integer.parseInt(con);
			String s = request.getParameter("id");
			int ID = Integer.parseInt(s);
			String ss = request.getParameter("cid");
			int CID = Integer.parseInt(ss);
			//List<Person> upd = myservice.update(ID, names, contacts, CID);
			//request.setAttribute("perlist", upd);
			request.getRequestDispatcher("/a.jsp").forward(request, response);

		}

	}
	
	@POST
	@Path("/edit")
	public void edit(@Context HttpServletRequest request, @Context HttpServletResponse response)
			throws ServletException, IOException {

		String list2 = request.getParameter("ubutton");

		if (list2.equals("update")) {
			System.out.println("kjoihrg");
			String names = request.getParameter("name");
			String con = request.getParameter("contact");
			int contacts = Integer.parseInt(con);
			String s = request.getParameter("id");
			int ID = Integer.parseInt(s);
			String ss = request.getParameter("cid");
			int CID = Integer.parseInt(ss);
			List<Person> upd = myservice.update(ID, names, contacts, CID);
			request.setAttribute("perlist", upd);
			request.getRequestDispatcher("/index.jsp").forward(request, response);

		}

	}

	@POST
	@Path("/delete")
	public void delete(@Context HttpServletRequest request, @Context HttpServletResponse response)
			throws ServletException, IOException {


			System.out.println("kjoihrg");

			String s = request.getParameter("id");
			int ID = Integer.parseInt(s);
			String ss = request.getParameter("cid");
			int CID = Integer.parseInt(s);
			List<Person> del = myservice.delete(ID, CID);
			request.setAttribute("perlist", del);
//			request.getRequestDispatcher("/index.jsp").forward(request, response);
			response.sendRedirect(request.getContextPath());

		

	}
	@POST
	@Path("/search")
	public void showlist(@Context HttpServletRequest request, @Context HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("search");
	List<Person> searchList = myservice.search(name);
		
		
		request.setAttribute("slist", searchList);
		
		request.getRequestDispatcher("/c.jsp").forward(request, response);

    	   }
//	@POST
//	@Path("/search")
//	public void search(@Context HttpServletRequest request, @Context HttpServletResponse response)
//			throws ServletException, IOException {
//		
//		String name = request.getParameter("sname");
//		
//		
//		 
//        List<Person> upd = myservice.search(name);
//        upd.forEach(person -> {
//
//			List<Contact> listofContact1 = person.getLaps();
//			listofContact1.forEach(contact1 -> {
//				System.out.println("contact no." + contact1.getCno());
//			});
//			System.out.println("person Id is :" + person.getId() + " person Name is:" + person.getName());
//		});
//		request.setAttribute("perlist", upd);
//		
//		request.getRequestDispatcher("/search.jsp").forward(request, response);
//
//
//	    

//	
//	 List<Person> per = myservice.showAllEmployees();
//	 for (Person item : per) {
//	 System.out.println(item);
//	 }
//	   request.setAttribute("perlist", per);
//	   request.getRequestDispatcher("a.jsp").forward(request, response);
//	
//	  } 

//@POST
//@Path("/name1")					
//				public List<Person> showAllEmployees(@Context HttpServletRequest request,@Context HttpServletResponse response)
//						throws ServletException, IOException {
//				{
//					
//					List<Person> emp = myservice.showAllEmployees();
//					   request.setAttribute("emplist", emp);
//					   request.getRequestDispatcher("a.jsp").forward(request, response);
//					   return emp;
//				}
//}

//  del.forEach(person -> {
//
//		List<Contact> listofContact1 = person.getLaps();
//		listofContact1.forEach(contact1 -> {
//			System.out.println("contact Id is :" + contact1.getCid() + "contact no." + contact1.getCno());
//		});
//		System.out.println("person Id is :" + person.getId() + " person Name is:" + person.getName());
//	});

//    upd.forEach(person -> {
//
//		List<Contact> listofContact1 = person.getLaps();
//		listofContact1.forEach(contact1 -> {
//			System.out.println("contact Id is :" + contact1.getCid() + "contact no." + contact1.getCno());
//		});
//		System.out.println("person Id is :" + person.getId() + " person Name is:" + person.getName());
//	});

//	List<Person> personList = myservice.showAllEmployees();
//	
//	personList.forEach(person -> {
//
//		List<Contact> listofContact1 = person.getLaps();
//		listofContact1.forEach(contact1 -> {
//			System.out.println("contact Id is :" + contact1.getCid() + "contact no." + contact1.getCno());
//		});
//		System.out.println("person Id is :" + person.getId() + " person Name is:" + person.getName());
//	});
//	request.setAttribute("perlist", personList);
//	
//	request.getRequestDispatcher("/a.jsp").forward(request, response);
//
//	   }
}
