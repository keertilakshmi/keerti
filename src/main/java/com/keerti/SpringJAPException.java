package com.keerti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan("com.keerti")
public class SpringJAPException {
	
		public static void main(String[] args) {
			SpringApplication.run(SpringJAPException.class, args);
		}
	}
