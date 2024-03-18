package com.turkcell.rentacar.entities.concretes;

import com.turkcell.rentacar.core.entities.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data //getter-setterları getiriyor. @Getter  sadece getter@Setter sadece ssetter getirir.
@AllArgsConstructor //hepsi için,consturtorlar
@NoArgsConstructor //parametresiz consturctorlar
@Entity //sen bir veritabanı varlığısın.
@Table(name = "brands") //tablonun ismi brands.
public class Brand extends BaseEntity {
    @Column(name = "name")
    private String name;

}
//concretes somut sınıflar