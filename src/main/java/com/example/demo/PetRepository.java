package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pets,Long> {
  Pets findByName(String name);

}
