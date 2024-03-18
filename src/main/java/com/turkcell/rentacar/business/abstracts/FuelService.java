package com.turkcell.rentacar.business.abstracts;

import com.turkcell.rentacar.entities.concretes.Fuel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface FuelService {
    Fuel add(Fuel fuel);
    Fuel getById(int id);
    List<Fuel> getAll();
    Fuel update(int id, Fuel fuel);
    void delete(int id);



}
