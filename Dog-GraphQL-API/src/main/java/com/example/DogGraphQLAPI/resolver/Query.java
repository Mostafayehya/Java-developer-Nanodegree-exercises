package com.example.DogGraphQLAPI.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.DogGraphQLAPI.entity.Dog;
import com.example.DogGraphQLAPI.exception.DogNotFoundException;
import com.example.DogGraphQLAPI.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {

    private DogRepository dogRepository;

    public Query(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public Iterable<Dog> findAllDogs() {
        return dogRepository.findAll();
    }

    public Dog findDogByID(String id) {
        Optional<Dog> dog = dogRepository.findById(id);
        if (dog.isPresent()) {
            return dog.get();
        } else {
            throw new DogNotFoundException("Dog Not Found", id);
        }
    }

}
