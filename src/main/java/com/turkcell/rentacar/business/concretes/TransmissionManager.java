package com.turkcell.rentacar.business.concretes;

import com.turkcell.rentacar.business.abstracts.TransmissionService;
import com.turkcell.rentacar.entities.concretes.Transmission;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TransmissionManager implements TransmissionService {
    @Override
    public Transmission add(Transmission transmission) {
        return null;
    }

    @Override
    public Transmission getById(int id) {
        return null;
    }

    @Override
    public List<Transmission> getAll() {
        return null;
    }

    @Override
    public Transmission update(int id, Transmission transmission) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
    //private fuelRepository fuelRepository;
}
