package com.mg.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConsulValidatorController {

	@Value("${first.rest.input}")
	private String consulKey;

	@GetMapping("/getConsulValue")
	public String getValueFromConsul() {
		System.out.println("Retrieved Consul Value : "+consulKey);
		return consulKey;
	}
}
