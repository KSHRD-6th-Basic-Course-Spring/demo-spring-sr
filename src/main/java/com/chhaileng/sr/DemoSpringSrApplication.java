package com.chhaileng.sr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

import com.chhaileng.sr.shape.Drawing;

@SpringBootApplication
public class DemoSpringSrApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DemoSpringSrApplication.class);
	}
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoSpringSrApplication.class, args);
		Drawing d = context.getBean(Drawing.class);
	
		d.drawShape();
		
		
//		String []beans = context.getBeanDefinitionNames();
//	
//		for(int i = 0 ; i<beans.length ; i++)
//			System.out.println(beans[i]);
//	
	
	
	}
}
