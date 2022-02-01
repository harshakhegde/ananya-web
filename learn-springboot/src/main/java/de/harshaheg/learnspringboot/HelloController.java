package de.harshaheg.learnspringboot;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class HelloController {

	final AtomicInteger counter = new AtomicInteger();

	@GetMapping("/")
	public String index() {
		return "I have counted till:"+ counter.toString();
	}

	@PutMapping("/")
	public String put(){
		int i = counter.incrementAndGet();
		return String.valueOf(i);
	}

	@DeleteMapping("/")
	public String post(){
		int i = counter.decrementAndGet();
		return String.valueOf(i);
	}

}