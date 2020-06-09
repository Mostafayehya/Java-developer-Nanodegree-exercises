package com.udacity.DogRestApi.service;

import com.udacity.DogRestApi.entity.Dog;

import java.util.List;

public interface DogService {

    List<String> retrieveDogBreed();

    String retrieveDogBreedById(Long id);

    List<String> retrieveDogNames();
}
