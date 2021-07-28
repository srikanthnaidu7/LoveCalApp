package com.loveapp.lc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.loveapp.lc.daoimpl.TestConnectionClass;
import com.loveapp.lc.formatter.PhoneNumberFormatter;



@EnableWebMvc
@Configuration()
@ComponentScan(basePackages = "com.loveapp.lc")
@PropertySource(value = "classpath:dbconnection.properties")
public class LoveCalAppConfig implements WebMvcConfigurer{

	@Autowired
	Environment environment;
	
	
	
	@Override
	public void addFormatters(FormatterRegistry registry) {

		registry.addFormatter(new PhoneNumberFormatter());
	}
	
	@Bean
	public InternalResourceViewResolver viewResolver(){
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
		
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/views/*").addResourceLocations("classpath:/views/");
	}
	
	@Bean(name = "messageSource")
	public MessageSource messageSource() {
		ResourceBundleMessageSource reloadableResourceBundleMessageSource = new ResourceBundleMessageSource();
		reloadableResourceBundleMessageSource.setBasename("customValidator");
		return reloadableResourceBundleMessageSource;
	}
	
	@Bean(name = "Validator")
	public LocalValidatorFactoryBean Validator() {
		LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
		localValidatorFactoryBean.setValidationMessageSource(messageSource());
		
		return localValidatorFactoryBean;
	}
	
	
	public org.springframework.validation.Validator getValidator() {
		return Validator();
	}
	
	@Bean
	public TestConnectionClass getTestConnectionClass() {
		 
		TestConnectionClass testConnectionClass = new TestConnectionClass();
		return testConnectionClass;
	}
	
	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		//driverManagerDataSource.setDriverClassName("${jdbc.driverClassName}");
		driverManagerDataSource.setDriverClassName(environment.getProperty("jdbc.driverClassName"));
		//driverManagerDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		driverManagerDataSource.setUrl(environment.getProperty("jdbc.url"));
		//driverManagerDataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		driverManagerDataSource.setUsername(environment.getProperty("jdbc.username"));
		//driverManagerDataSource.setUsername("sri");
		driverManagerDataSource.setPassword(environment.getProperty("jdbc.password"));
		//driverManagerDataSource.setPassword("sri");
		
		return driverManagerDataSource;
		
	}
	
}
