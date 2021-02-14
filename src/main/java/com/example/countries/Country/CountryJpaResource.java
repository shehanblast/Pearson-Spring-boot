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

    @GetMapping("/rest/v2/jpa/countries")
    public List<Country> getAllTodos(){

        return countryJpaRepo.findAll();

    }


    @GetMapping("/rest/v2/jpa/{username}/countries/{id}")
    public Country getTodo(@PathVariable String username,
                        @PathVariable Long id){
        //return todoService.findById(id);
        return countryJpaRepo.findById(id).get();

    }

    @DeleteMapping("/rest/v2/jpa/{username}/countries/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String username,
                                           @PathVariable Long id){

        //Todo todo = todoService.deleteById(id);
        countryJpaRepo.deleteById(id);


        return ResponseEntity.noContent().build();


        //return ResponseEntity.notFound().build();
    }

    @PutMapping("/rest/v2/jpa/{username}/countries/{id}")
    public ResponseEntity<Country> updateTodo(@PathVariable String username,
                                           @PathVariable Long id,
                                           @RequestBody Country country){

        //Todo todoUpdated = todoService.save(todo);
        Country todoUpdated = countryJpaRepo.save(country);

        return new ResponseEntity<Country>(country, HttpStatus.OK);

    }

    @PostMapping("/rest/v2/jpa/{username}/countries")
    public ResponseEntity<Void> createTodo(@PathVariable String username,
                                           @RequestBody Country country){
        //Todo createdTodo = todoService.saveii(todo);
        country.setUsername(username);
        Country createdTodo = countryJpaRepo.save(country);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(createdTodo.getId()).toUri();


        return ResponseEntity.created(uri).build();

    }





}
