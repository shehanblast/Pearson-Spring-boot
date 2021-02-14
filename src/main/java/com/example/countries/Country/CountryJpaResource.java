package com.example.countries.Country;

//import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.FileNotFoundException;
import java.net.URI;
import java.util.List;



@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class CountryJpaResource {

    @Autowired
    private CountryJpaRepo countryJpaRepo;

    @GetMapping("/jpa/users/todos")
    public List<Country> getAllTodos(){

        return countryJpaRepo.findAll();

    }

    @GetMapping("/jpa/users/todoss")
    public String getAllTodosf(){

        return "Hello world!";

    }





}
