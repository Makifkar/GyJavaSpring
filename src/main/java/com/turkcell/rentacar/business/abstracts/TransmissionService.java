package com.turkcell.rentacar.business.abstracts;

import com.turkcell.rentacar.entities.concretes.Fuel;
import com.turkcell.rentacar.entities.concretes.Transmission;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TransmissionService {
    Transmission add(Transmission transmission);
    Transmission getById(int id);
    List<Transmission> getAll();
    Transmission update(int id, Transmission transmission);
    void delete(int id);
}
