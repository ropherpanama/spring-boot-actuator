package com.monitoring.tools.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monitoring.tools.model.Tutorial;

@RestController
public class TutorialController {

	@GetMapping("/tutorial")
	public ResponseEntity<Tutorial> getTutorialInfo() {
		Tutorial tutorial = new Tutorial();
		tutorial.setAuthor("Rosendo Ropher");
		tutorial.setTopic("Spring Boot with Actuator");
		return new ResponseEntity<Tutorial>(tutorial, HttpStatus.OK);
	}
}
