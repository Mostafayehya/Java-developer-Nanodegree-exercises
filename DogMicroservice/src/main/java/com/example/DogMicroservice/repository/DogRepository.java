package com.example.DogMicroservice.repository;

import com.example.DogMicroservice.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog,String> {
}
