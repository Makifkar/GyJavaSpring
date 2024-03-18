package com.turkcell.rentacar.core.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data //getter-setterları getiriyor. @Getter  sadece getter@Setter sadece ssetter getirir.
@AllArgsConstructor //hepsi için,consturtorlar
@NoArgsConstructor //parametresiz consturctorlar
@MappedSuperclass //aplicationda de hata verince yazdık. inherite edenler de senin alanlarını kendinde maplasin.
public class BaseEntity {
    @Id //veritabanında id kolunu
    @GeneratedValue(strategy = GenerationType.IDENTITY) //veri tabanında 12345 kendin id oluştur.
    @Column(name = "id") //veritabanı tablosunda kolon ismi id.
    private int id;
    @Column(name = "createdDate")
    private LocalDateTime createdDate;
    @Column(name = "updateDate")
    private LocalDateTime updateDate;
    @Column(name = "deletedDate")
    private LocalDateTime deletedDate;

}
