package com.example.superherov5.repositories;

import com.example.superherov5.dto.CityDTO;
import com.example.superherov5.dto.CountPowerDTO;
import com.example.superherov5.dto.SuperPowerDTO;
import com.example.superherov5.dto.SuperheroFormDTO;
import com.example.superherov5.model.Superhero;

import java.util.List;

public interface IRepository {
    List<Superhero> getSuperheroes();
    Superhero getSuperhero(String superheroName);
    Superhero getSuperheroId(int superhero);

    List<CountPowerDTO> getSuperpowerCount();
    SuperPowerDTO getSuperPower(String SuperheroName);
    List<CityDTO> getCity();
    CityDTO getCitySuperheroName(String superheroName);
    List<String> getCities();
    List<String> getPowers();
    void addSuperHero(SuperheroFormDTO superheroFormDTO);
    void updateSuperhero(SuperheroFormDTO superheroFormDTO);
}
