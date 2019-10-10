package com.test.docker.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker")
public class DockerTestResource {
	
	@GetMapping("/test")
	public String testDocker() {
		return "Docker test";
	}

}
