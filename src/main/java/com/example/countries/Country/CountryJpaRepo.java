package com.example.countries.Country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface CountryJpaRepo extends JpaRepository<Country,Long> {

    List<Country> findByUsername(String username);

    List<Country> findByName(String username);

}
