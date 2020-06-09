package com.udacity.DogRestApi.repository;

import com.udacity.DogRestApi.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog, Long> {

    @Query("select d.Breed from Dog d")
    List<String> retrieveDogBreed();


    @Query("select d.Breed from Dog d where d.id=:id")
    String retrieveDogBreedById(Long id);

    @Query("select d.Name from Dog d")
    List<String> retrieveDogNames();


}
