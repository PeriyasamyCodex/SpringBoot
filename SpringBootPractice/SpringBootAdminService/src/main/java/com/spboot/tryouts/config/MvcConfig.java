package com.spboot.tryouts.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry viewControllerRegistry) {

		viewControllerRegistry.addViewController("/login").setViewName("login");
		viewControllerRegistry.addViewController("/admin").setViewName("dashboard");

	}

}
