package de.snuk.serviceone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.snuk.serviceone.domain.model.Person;
import de.snuk.serviceone.domain.repository.PersonRepository;

@Service("personService")
public class PersonService {

	private final PersonRepository repo;

	@Autowired
	public PersonService(PersonRepository repo) {
		this.repo = repo;
	}

	@Transactional(readOnly = true)
	public List<Person> findAllPersons() {
		return repo.findAll();
	}

	@Transactional
	public Person savePerson(Person p) {
		return repo.save(p);
	}

}
