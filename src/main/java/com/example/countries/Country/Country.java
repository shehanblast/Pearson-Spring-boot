package com.example.countries.Country;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Country {

    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String name;
    private String capital;
    private String language;
    private String currency;
    private int population;
    private String president;

    public Country() {

    }

    public Country(long id,String username, String name, String capital, String language, String currency, int population, String president) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.capital = capital;
        this.language = language;
        this.currency = currency;
        this.population = population;
        this.president = president;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return population == country.population &&
                Objects.equals(id, country.id) &&
                Objects.equals(username, country.username) &&
                Objects.equals(name, country.name) &&
                Objects.equals(capital, country.capital) &&
                Objects.equals(language, country.language) &&
                Objects.equals(currency, country.currency) &&
                Objects.equals(president, country.president);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, name, capital, language, currency, population, president);
    }
}
