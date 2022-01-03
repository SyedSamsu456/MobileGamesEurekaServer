package com.capg.mobilegameseurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MobileGamesEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileGamesEurekaServerApplication.class, args);
	}

}
