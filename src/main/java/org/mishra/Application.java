package org.mishra;

import org.mishra.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		int i=10;
		int j=20;
		UserService bean = run.getBean(UserService.class);
		bean.printUserName();
	}

}