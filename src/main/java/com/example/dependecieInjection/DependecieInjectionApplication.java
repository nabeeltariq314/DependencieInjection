package com.example.dependecieInjection;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependecieInjectionApplication {

	public static void main(String[] args) {

		// There are two types of DI in spring boot Singleton and Prototype
		// By default spring boot uses Singleton DI which automatically creates an obj only once
		// In prototype DI objects are created when we create them no by default obj is created by spring boot

		ConfigurableApplicationContext context = SpringApplication.run(DependecieInjectionApplication.class, args);
		Alien a1 = context.getBean(Alien.class);
		a1.Show();

//		Alien a2 = context.getBean(Alien.class);
//		a2.Show();

	}

}
