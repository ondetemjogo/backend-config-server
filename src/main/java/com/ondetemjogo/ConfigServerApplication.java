package com.ondetemjogo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication(scanBasePackages = "com.ondetemjogo")
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		System.setProperty("spring.application.name", "config-server");
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
