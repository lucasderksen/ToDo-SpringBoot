package com.lucas.todosspringboot.pages;

import org.springframework.web.bind.annotation.GetMapping;

public class PagesController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
}
