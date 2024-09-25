package com.example.jpa_workshop.repository;

import com.example.jpa_workshop.entity.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Long> {

    List<AppUser> getUserByRegDate(LocalDate regDate);

    Optional<AppUser> getUserByUserName(String email);

    Optional <AppUser> getUserByUserDetailsId(Long id);

    Optional<AppUser> getAppUserByUserDetailsEmailIgnoreCase(String email);

}
