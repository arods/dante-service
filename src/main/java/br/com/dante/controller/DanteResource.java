package br.com.dante.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dante")
public class DanteResource {

	@GetMapping("/phone")
	public String getPhone(@RequestHeader Map<String, String> headers) {
		headers.forEach((k, v) -> System.out.println("Key(Interface) = " + k + ", Value(Implementation class) = " + v));

		return "99999-9999";
	}

}
