package com.turkcell.rentacar.api.controllers;

import ch.qos.logback.core.BasicStatusManager;
import com.turkcell.rentacar.business.abstracts.FuelService;
import com.turkcell.rentacar.business.abstracts.ModelService;
import com.turkcell.rentacar.entities.concretes.Brand;
import com.turkcell.rentacar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/models")
public class ModelController {
    private ModelService modelService;

    @PostMapping //bir post yapıldığında sen çalış.
    @ResponseStatus(HttpStatus.CREATED)
    public Model add(@RequestBody Model model){

        return modelService.add(model);
    }
}
//Bu kısım karıştı, anlamadım. Copy Paste yapmak istemiyorum, anladığım kadar.
