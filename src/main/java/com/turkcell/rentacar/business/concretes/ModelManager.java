package com.turkcell.rentacar.business.concretes;

import com.turkcell.rentacar.business.abstracts.ModelService;
import com.turkcell.rentacar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ModelManager implements ModelService {
    @Override
    public Model add(Model model) {
        return null;
    }

    @Override
    public Model getById(int id) {
        return null;
    }

    @Override
    public List<Model> getAll() {
        return null;
    }

    @Override
    public Model update(int id, Model model) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
