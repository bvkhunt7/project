package com.axelor.restdemo.module;



import com.axelor.restdemo.service.MyService;
import com.axelor.restdemo.service.MyServiceImpl;
import com.axelor.restdemo.web.Controller;
import com.axelor.restdemo.web.UpdateController;
import com.google.inject.AbstractModule;
import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Singleton;
import com.google.inject.persist.PersistFilter;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.google.inject.servlet.ServletModule;



public class GuiceModule extends AbstractModule{

	@Override
	public void configure() {
		bind(Controller.class);
//		bind(UpdateController.class);
		bind(MyService.class).to(MyServiceImpl.class);
		
	}

  
}
