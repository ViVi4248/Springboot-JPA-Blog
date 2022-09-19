package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogControllerTest {

	//결과: http://localhost:8080/test/hello를 주소창에 입력하면 내가 적은 내용이 뜬다
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
}
