package com.example.jpa_workshop.repository;

import com.example.jpa_workshop.entity.Details;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DetailsRepository extends CrudRepository<Details, Long> {

    Optional<Details> findByEmail(String email);

    Optional<Details> findByNameContaining(String name);

    Optional<Details> findByNameIgnoreCase(String name);

}
