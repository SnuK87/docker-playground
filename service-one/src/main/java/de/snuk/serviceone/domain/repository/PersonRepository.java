package de.snuk.serviceone.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.snuk.serviceone.domain.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
