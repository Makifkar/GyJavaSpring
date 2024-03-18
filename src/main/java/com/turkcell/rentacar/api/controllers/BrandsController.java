package com.turkcell.rentacar.api.controllers;

import com.turkcell.rentacar.business.abstracts.BrandService;
import com.turkcell.rentacar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/brands") //versiyonlama. benim adresim
//turkcell.com.tr./xproject/api/v1/brands >kök+...
//localhost:8080/api/v1/brands
public class BrandsController {
    //apilerde çoğul s takısı ile kullanılır.
    private BrandService brandService;  //IoC= bellekte clas.
    //servisi kullanmalıyız.
    @PostMapping //bir post yapıldığında sen çalış.

    @ResponseStatus(HttpStatus.CREATED)
    public Brand add(@RequestBody Brand brand){
    return brandService.add(brand);
    }
}

//Bu kısım karıştı, anlamadım. Copy Paste yapmak istemiyorum, anladığım kadar.