package com.example.jpa_workshop.repository;

import com.example.jpa_workshop.entity.AppUser;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface AppUserRepository extends CrudRepository<AppUser, Long> {

    AppUser getUserByRegDate(LocalDate regDate);

    AppUser getUserByUserName(String email);

    AppUser getUserByUserDetailsId(Long id);

    AppUser getAppUserByUserDetailsEmailIgnoreCase(String email);

}
