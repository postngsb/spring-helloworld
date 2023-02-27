package dev.snie.spring.helloworld;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/")
	public Hello hello() {
		return new Hello(counter.incrementAndGet(), "Hello World!");
	}
}
