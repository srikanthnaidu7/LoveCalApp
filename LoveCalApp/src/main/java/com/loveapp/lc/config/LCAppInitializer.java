package com.loveapp.lc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LCAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		Class cls[] = {LoveCalAppConfig.class};
		return cls;
	}

	@Override
	protected String[] getServletMappings() {
		
		//String[] urlPattern = {"/"};
		String[] urlPattern = {"/website/*"};
		
		return urlPattern;
	}

}
