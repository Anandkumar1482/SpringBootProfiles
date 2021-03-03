package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class SpringProfilesApplication {

	@Autowired
	private ProfileEnvironment pv;

	public static void main(String[] args) {
		SpringApplication.run(SpringProfilesApplication.class, args);
	}

	@Bean
	@Profile("dev")
	public ProfileEnvironment dev() {

		System.out.println("dev environment");
		System.out.println(pv.toString());
		return pv;
	}

	@Bean
	@Profile("test")
	public ProfileEnvironment test() {

		System.out.println("test environment");
		System.out.println(pv);
		return pv;
	}

	@Bean
	@Profile("prod")
	public ProfileEnvironment prod() {

		System.out.println("prod environment");
		System.out.println(pv.toString());
		return pv;
	}

	@Bean
	public ProfileEnvironment own() {
		System.out.println("own environment");
		System.out.println(pv.toString());
		return pv;
	}
}
