package com.example.examan.ctrleaman.entities.enums;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Voyageur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long  idVoyageur;
    private String nomVoyageur;

    @ManyToMany(mappedBy = "voyageur")
    private List<Voyage> voyage = new ArrayList<>();


}
