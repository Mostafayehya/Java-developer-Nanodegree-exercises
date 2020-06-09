package com.udacity.DogRestApi.service;

import com.udacity.DogRestApi.entity.Dog;
import com.udacity.DogRestApi.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class DogServiceImpl implements DogService {
    private DogRepository dogRepository;

    @Autowired
    public void setDogRepository(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }


    @Override
    public List<String> retrieveDogBreed() {
        return dogRepository.retrieveDogBreed();
    }

    @Override
    public String retrieveDogBreedById(Long id) {
        Optional<String> optional = Optional.ofNullable(dogRepository.retrieveDogBreedById(id));
        String breed = optional.orElseThrow(DogNotFoundException::new);
        return breed;

    }

    @Override
    public List<String> retrieveDogNames() {
        return dogRepository.retrieveDogNames();
    }
}
