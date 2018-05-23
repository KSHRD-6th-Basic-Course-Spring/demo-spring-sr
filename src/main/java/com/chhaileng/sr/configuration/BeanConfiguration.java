package com.chhaileng.sr.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chhaileng.sr.shape.Circle;
import com.chhaileng.sr.shape.Drawing;
import com.chhaileng.sr.shape.Rectangle;

@Configuration
public class BeanConfiguration {
	
	private Rectangle r;
	private Circle c;
	
	@Autowired
	public void setRectangle(@Qualifier("rectangle1") Rectangle r) {
		this.r = r;
	}
	
	@Autowired
	public void setCircle(Circle c) {
		this.c = c;
	}
	
	@Bean
	public Circle circle() {
		return new Circle();
	}
	
	
	
	@Bean(name = "rectangle1")
	public Rectangle rectangle() {
		return new Rectangle();
	}
	
	@Bean
	public Drawing drawing() {
		Drawing d = new Drawing();
		d.setShape(r);
		return  d;
	}
}
