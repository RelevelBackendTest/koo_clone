package com.relevel.backend.koo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KooController {

	@GetMapping("/ping")
	public String ping() {
		return "Ping is Successful";
	}
}

