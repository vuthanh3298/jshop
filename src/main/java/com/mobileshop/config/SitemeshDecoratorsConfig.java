package com.mobileshop.config;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;

/**
 * SitemeshDecoratorsConfig
 */
@Configuration
public class SitemeshDecoratorsConfig implements WebApplicationInitializer {
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		addSitemeshFilterToServletContext(servletContext);
	}
	
	private void addSitemeshFilterToServletContext(ServletContext servletContext) {
		FilterRegistration.Dynamic sitemesh = servletContext.addFilter("sitemesh", new SitemeshDecoratorsFilter());
		EnumSet<DispatcherType> sitemeshDispatcherTypes = EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD);
		sitemesh.addMappingForUrlPatterns(sitemeshDispatcherTypes, true, "/*");
	}
}