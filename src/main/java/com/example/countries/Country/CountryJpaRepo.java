package com.example.countries.Country;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryJpaRepo extends JpaRepository<Country,Long> {

    List<Country> findByUsername(String username);

    List<Country> findByName(String username);

}
