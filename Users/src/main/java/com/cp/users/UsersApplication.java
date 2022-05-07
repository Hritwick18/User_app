package com.cp.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

/**
 * Main Application function
 * @author hritwick 
 *
 */
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "User API", version = "2.0", description = "User Information",contact =@Contact(email ="hritwickgoyal.hg@gmail.com"),license =@License(name = "License 5.0")))
public class UsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersApplication.class, args);
	}

}
