package com.example.superherov5.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Superhero {
    private int superheroId;
    private String superHeroName;
    private String reelName;
    private String city;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private java.sql.Date creationYear;



    //konstruktør
    public Superhero(int superheroId, String superHeroName, String reelName, String city, java.sql.Date creationYear){
        this.superheroId = superheroId;
        this.superHeroName = superHeroName;
        this.reelName = reelName;
        this.city = city;
        this.creationYear = creationYear;
    }
    public Superhero(){}

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    //Gettere
    public String getSuperHeroName() {
        return superHeroName;
    }
    public String getReelName() {
        return reelName;
    }


    public java.sql.Date getCreationYear() {
        return (java.sql.Date) creationYear;
    }

    public int getsuperheroId(){
        return superheroId;
    }

    public void setSuperheroName(String newSuperheroName) {
        this.superHeroName = newSuperheroName;
    }
    public void setReelName(String newReelName) {
        this.reelName = newReelName;
    }
    public void setCreationYear(java.sql.Date newCreationYear) {
        this.creationYear = newCreationYear;
    }


}

