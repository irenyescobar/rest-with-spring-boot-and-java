package br.com.ireny.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ireny.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {}
