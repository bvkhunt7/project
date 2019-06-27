package com.axelor.restdemo.module;

import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;

import org.jboss.resteasy.plugins.guice.GuiceResteasyBootstrapServletContextListener;
import org.jboss.resteasy.plugins.server.servlet.ResteasyBootstrap;

import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;

public class MyConfig extends GuiceResteasyBootstrapServletContextListener {
	
	 @Override
	    protected List <? extends Module > getModules(ServletContext  context)
	    {
	        return Arrays .asList(new JpaPersistModule("pu"), new GuiceModule());
	    }
	    
	    @Override
	    public void withInjector(Injector  injector)
	    {
	        injector.getInstance(PersistService.class).start();
	    }
}
