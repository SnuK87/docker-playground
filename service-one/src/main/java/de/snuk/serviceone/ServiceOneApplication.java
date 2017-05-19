package de.snuk.serviceone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import de.snuk.serviceone.domain.model.Person;
import de.snuk.serviceone.service.PersonService;

@SpringBootApplication
@RestController
public class ServiceOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceOneApplication.class, args);
	}

	@Autowired
	private PersonService service;

	@GetMapping("/hello")
	public String hello() {
		return "Hello from Service One.";
	}

	@GetMapping("/persons")
	public List<Person> persons() {
		return service.findAllPersons();
	}

	// @Bean
	// CommandLineRunner runner() {
	// return args -> {
	// service.savePerson(new Person(null, "Peter", "Lustig"));
	// };
	// }
}
