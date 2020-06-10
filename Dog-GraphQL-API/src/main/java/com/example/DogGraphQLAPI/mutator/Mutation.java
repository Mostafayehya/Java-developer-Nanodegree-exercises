package com.example.DogGraphQLAPI.mutator;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.DogGraphQLAPI.entity.Dog;
import com.example.DogGraphQLAPI.exception.BreedNotFoundException;
import com.example.DogGraphQLAPI.exception.DogNotFoundException;
import com.example.DogGraphQLAPI.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Mutation implements GraphQLMutationResolver {

    private DogRepository dogRepository;

    public Mutation(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    // I think this will need a custom query
    public boolean deleteDogBreed(String breed) {
        boolean deleted = false;
        Iterable<Dog> dogList = dogRepository.findAll();
        for (Dog d : dogList) {
            if (d.getBreed().equals(breed)) {
                dogRepository.delete(d);
                deleted = true;
            }
        }

        if (!deleted) {
            throw new BreedNotFoundException("Breed not found", breed);
        }
        return deleted;
    }

    public Dog updateDogName(String id, String newName) {

        Optional<Dog> optionalDog = dogRepository.findById(id);

        if (optionalDog.isPresent()) {
            Dog newDog = optionalDog.get();
            newDog.setName(newName);
            dogRepository.save(newDog);
            return newDog;
        } else {
            throw new DogNotFoundException("Dong not found", id);
        }
    }

}
