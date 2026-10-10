package dev.team4.scrumboard;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ScrumboardApplication {
	
	private AtomicInteger clickCount = new AtomicInteger(1);
	
	public static void main(String[] args) {
		SpringApplication.run(ScrumboardApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello, world!";
	}
	
	@GetMapping("/user")
	public User user() {
		return new User("Max Mustermann", "test@example.com");
	}
	
	@GetMapping("/count")
	public String count() {
		return "<button hx-get=\"/click\" hx-swap=\"outerHTML\">Count: " + clickCount.get() + "</button>";
	}
	
	@GetMapping("/click")
	public String click() {
		return "<button hx-get=\"/click\" hx-swap=\"outerHTML\">Count: " + clickCount.incrementAndGet() + "</button>";
	}
	
}
