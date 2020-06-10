package com.example.DogGraphQLAPI.repository;

import com.example.DogGraphQLAPI.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, String> {
}
