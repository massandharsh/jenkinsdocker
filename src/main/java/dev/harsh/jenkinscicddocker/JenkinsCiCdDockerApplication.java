package dev.harsh.jenkinscicddocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsCiCdDockerApplication {

	@GetMapping("/hello")
	public  String getHello(){
		return "Hello World this it's Harsh!";
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinsCiCdDockerApplication.class, args);
	}

}
