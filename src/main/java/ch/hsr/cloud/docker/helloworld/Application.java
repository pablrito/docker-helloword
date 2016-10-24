package ch.hsr.cloud.docker.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {
		return String.format("Hello Docker Cloud World! My first deploy , time is now %s", new Date().toString() );
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
