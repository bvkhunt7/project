package com.axelor.restdemo.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
@Path("/resteasyupdate")
public class UpdateController {

	@Inject
	MyService myservice;

	@POST
	@Path("/nameupdate")
	public void update(@FormParam("id") int id ,@FormParam("name") String name,@FormParam("contact") long contact,@FormParam("cid") int cid,
			@Context HttpServletRequest request, @Context HttpServletResponse response)
			throws ServletException, IOException {{
		
				
				  
				 String list2 = request.getParameter("ubtn");
		    	   if(list2.equals("update"))
		    	   { 
		    		   System.out.println("kjoihrg");
//		    	   String name = request.getParameter("dname");
		    		   
		    		   String s = request.getParameter("did");
		    	       
		    		   int a = Integer.parseInt(s);
		    	        
		    	        String ss = request.getParameter("cid");
		    	       
		    	        int aa = Integer.parseInt(ss);
		    	        
		    	        List<Person> upd = myservice.update(id, name, contact, cid);
		    	        
		    	        upd.forEach(person -> {

		    				List<Contact> listofContact1 = person.getLaps();
		    				listofContact1.forEach(contact1 -> {
		    					System.out.println("contact Id is :" + contact1.getCid() + "contact no." + contact1.getCno());
		    				});
		    				System.out.println("person Id is :" + person.getId() + " person Name is:" + person.getName());
		    			});
		    			request.setAttribute("perlist", upd);
		    			
		    			request.getRequestDispatcher("/b.jsp").forward(request, response);

		   
		    		    
		    	   }

}
	}	
}