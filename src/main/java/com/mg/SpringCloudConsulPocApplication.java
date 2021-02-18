package com.mg;

import com.mg.resource.ConsulValidatorController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackageClasses= {ConsulValidatorController.class})
public class SpringCloudConsulPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsulPocApplication.class, args);
	}
}
