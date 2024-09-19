package com.example.jpa_workshop.repository;

import com.example.jpa_workshop.entity.Details;
import org.springframework.data.repository.CrudRepository;

public interface DetailsRepository extends CrudRepository<Details, Long> {

    Details findByEmail(String email);

    Details findByNameContaining(String name);

    Details findByNameIgnoreCase(String name);

}
