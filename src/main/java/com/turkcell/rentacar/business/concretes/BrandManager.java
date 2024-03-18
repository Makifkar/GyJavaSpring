package com.turkcell.rentacar.business.concretes;

import com.turkcell.rentacar.business.abstracts.BrandService;
import com.turkcell.rentacar.dataAccess.abstracts.BrandRepository;
import com.turkcell.rentacar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service //sen bir servissin.kendini belleğe at.
public class BrandManager implements BrandService {
    private BrandRepository brandRepository; //consturctoru yapmak lazım. allargsconsturtor yapıyo onu
    @Override
    public Brand add(Brand brand) {
        //iş kuralları, veri tabanına aklemek için brand nesnesi verildi.
        //save ile kaydetti. eklenmiş halini id si ile verdi. ve onu return ettik.
        Brand createdBrand = brandRepository.save(brand);
        return createdBrand;
    }
}
