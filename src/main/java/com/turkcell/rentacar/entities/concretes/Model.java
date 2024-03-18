package com.turkcell.rentacar.entities.concretes;

import com.turkcell.rentacar.core.entities.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //getter-setterları getiriyor. @Getter  sadece getter@Setter sadece ssetter getirir.
@AllArgsConstructor //hepsi için,consturtorlar
@NoArgsConstructor //parametresiz consturctorlar
@Entity //sen bir veritabanı varlığısın.
@Table(name = "models")
public class Model extends BaseEntity {
    @Column(name = "name")
    private String name;
}
