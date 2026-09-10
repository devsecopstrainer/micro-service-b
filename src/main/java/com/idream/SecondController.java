package com.idream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class SecondController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SecondController.class);

    @GetMapping("/")
    public String home() {
    	LOGGER.info("Home endpoint accessed - serving welcome page");
        return "<h1>Welcome from micro service B.</h1>";
    }
	
	@PostMapping("/get-data")
	public String getData() {
		LOGGER.info("*----------- Second micro service calld -----------*");
		String resp = "Welcome from Second Micro Service";
		LOGGER.info("Response sent from micro service B -> " + resp);
		return resp;
	}
}
