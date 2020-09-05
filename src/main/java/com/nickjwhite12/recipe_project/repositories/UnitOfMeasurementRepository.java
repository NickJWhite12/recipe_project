package com.nickjwhite12.recipe_project.repositories;

import com.nickjwhite12.recipe_project.model.UnitOfMeasurement;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasurementRepository extends CrudRepository<UnitOfMeasurement, Long> {
    Optional<UnitOfMeasurement> findByUnitOfMeasure(String UnitOfMeasure);
}
