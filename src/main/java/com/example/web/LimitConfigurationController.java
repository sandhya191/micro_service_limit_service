package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Sandhya
 * Limit Service Application dispalys mimimum and maximum 
 * values of the service
 *
 */

@RestController
public class LimitConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitFromConfigurations() {
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
		
	}

}
