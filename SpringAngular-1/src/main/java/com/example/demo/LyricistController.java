package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LyricistController {

	@RequestMapping("/welcome")
	public String welcome(@RequestParam String fame) {
		return "Hello " + fame;
	}
}
