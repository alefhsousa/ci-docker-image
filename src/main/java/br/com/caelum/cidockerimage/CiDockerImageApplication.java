package br.com.caelum.cidockerimage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class CiDockerImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiDockerImageApplication.class, args);
	}

}

@RestController
@RequestMapping("/api/data")
class SimpleController {

	@GetMapping
	public ResponseEntity<String> getData() {
		return ResponseEntity.ok("Everythin is ok");
	}
}
