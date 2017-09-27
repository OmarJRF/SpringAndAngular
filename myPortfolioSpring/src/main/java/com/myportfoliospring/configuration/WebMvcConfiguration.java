package com.myportfoliospring.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.myportfoliospring.component.RequestTimeInterceptorComponent;

@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

	@Autowired
	@Qualifier("requestTimeInterceptorComponent")
	private RequestTimeInterceptorComponent requestTimeInterceptorComponent;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(requestTimeInterceptorComponent);
	}

}
