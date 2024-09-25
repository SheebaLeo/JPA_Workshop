package com.example.jpa_workshop;

import com.example.jpa_workshop.entity.AppUser;
import com.example.jpa_workshop.entity.Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.jpa_workshop.repository.AppUserRepository;
import com.example.jpa_workshop.repository.DetailsRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Component
public class MyCommandLineRunner implements CommandLineRunner {


    @Autowired
    AppUserRepository appUserRepository;

    @Autowired
    DetailsRepository detailsRepository;

    @Override
    public void run(String... args) throws Exception {
        Details details1 = detailsRepository.save(new Details("asd nbjnkl@qwe.com", "vvvv", LocalDate.of(1990, 01, 01)));
        appUserRepository.save(new AppUser("sheeba", "1234", details1 ));
        Optional<AppUser> appuser = appUserRepository.getUserByUserDetailsId(1L);
        System.out.println(appuser.toString());
        Optional<AppUser> appuser2 = appUserRepository.getUserByUserName("sheeba");
        System.out.println(appuser2.toString());
        List<AppUser> appuser3 = appUserRepository.getUserByRegDate(LocalDate.of(2024, 9, 19));
        System.out.println(appuser3.toString());
        Optional<AppUser> appuser4 = appUserRepository.getAppUserByUserDetailsEmailIgnoreCase("ASD nbjnkl@qwe.com");
        System.out.println(appuser4.toString());
        Optional<Details> details2 = detailsRepository.findByEmail("asd nbjnkl@qwe.com");
        System.out.println(details2.toString());
        Optional<Details> details3 = detailsRepository.findByNameContaining("v");
        System.out.println(details3.toString());
        Optional<Details> details4 = detailsRepository.findByNameIgnoreCase("VVVv");
        System.out.println(details4.toString());

    }
}