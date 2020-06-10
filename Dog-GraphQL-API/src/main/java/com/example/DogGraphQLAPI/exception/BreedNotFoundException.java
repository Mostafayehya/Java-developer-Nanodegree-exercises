package com.example.DogGraphQLAPI.exception;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;
import org.aspectj.apache.bcel.classfile.annotation.RuntimeTypeAnnos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BreedNotFoundException extends RuntimeException implements GraphQLError {

    Map<String, Object> extenstions = new HashMap<>();

    public BreedNotFoundException(String breed_not_found, String breed) {
        super(breed_not_found);
        extenstions.put("breedIsNotValid", breed);
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.DataFetchingException;
    }

    @Override
    public Map<String, Object> getExtensions() {
        return extenstions;
    }
}
