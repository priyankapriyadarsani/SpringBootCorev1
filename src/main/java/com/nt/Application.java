package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.beans.WishMessageGenerator;

@SpringBootApplication
public class Application {
	@Bean("ldt")
	public LocalDateTime createLDT() {
		System.out.println("Application.createLDT()");
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
	WishMessageGenerator gen=	context.getBean("wmg",WishMessageGenerator.class);
	String res=	gen.generateMessage("Raja");
		System.out.println(res);
		
	}

}
