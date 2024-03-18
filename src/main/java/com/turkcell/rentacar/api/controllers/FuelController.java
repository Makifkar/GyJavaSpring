package com.turkcell.rentacar.api.controllers;

import com.turkcell.rentacar.business.abstracts.BrandService;
import com.turkcell.rentacar.business.abstracts.FuelService;
import com.turkcell.rentacar.entities.concretes.Brand;
import com.turkcell.rentacar.entities.concretes.Fuel;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/fuels")
public class FuelController {
    private FuelService fuelService;
    @PostMapping //bir post yapıldığında sen çalış.

    @ResponseStatus(HttpStatus.CREATED)
    public Fuel add(@RequestBody Fuel fuel){
        return fuelService.add(fuel);
    }

}
//Bu kısım karıştı, anlamadım. Copy Paste yapmak istemiyorum, anladığım kadar.