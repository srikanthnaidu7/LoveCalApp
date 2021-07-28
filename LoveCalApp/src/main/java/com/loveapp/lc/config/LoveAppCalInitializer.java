package com.loveapp.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


public class LoveAppCalInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		System.out.println("Hello Spring!");
		
		/*
		 * XmlWebApplicationContext webAppContext = new XmlWebApplicationContext();
		 * webAppContext.setConfigLocation("classpath:"mydispatcher.servlet.xml");
		 */
		
		AnnotationConfigWebApplicationContext webAppContext = new AnnotationConfigWebApplicationContext();
		webAppContext.register(LoveCalAppConfig.class);
		
		//Create Dispatcher Servlet object
		DispatcherServlet dispatcherServlet = new DispatcherServlet();
		dispatcherServlet.setApplicationContext(webAppContext);
		
		
		//Register Dispatcher servlet
		ServletRegistration.Dynamic  myDispatcherServlet = servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		myDispatcherServlet.setLoadOnStartup(1);
		//myDispatcherServlet.addMapping("/*");
		myDispatcherServlet.addMapping("/website/*");
		
	}

}
