package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping(value = { "/", "/test" })
	@ResponseBody
	public String test() {

		return "Spring Boot running......";
	}
}
