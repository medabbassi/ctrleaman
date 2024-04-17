package com.example.examan.ctrleaman.entities.enums;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTrain;
    private long codeTrain;
    @Enumerated(EnumType.STRING)
    private etatTrain etat;
    private long  nbPlaceLibre;

   @OneToMany
    @JoinColumn(name = "id_train")
    private List<Voyage> voyage;


    public long getIdTrain() {
        return idTrain;
    }

    public void setIdTrain(long idTrain) {
        this.idTrain = idTrain;
    }

    public long getCodeTrain() {
        return codeTrain;
    }

    public void setCodeTrain(long codeTrain) {
        this.codeTrain = codeTrain;
    }

    public etatTrain getEtat() {
        return etat;
    }

    public void setEtat(etatTrain etat) {
        this.etat = etat;
    }

    public long getNbPlaceLibre() {
        return nbPlaceLibre;
    }

    public void setNbPlaceLibre(long nbPlaceLibre) {
        this.nbPlaceLibre = nbPlaceLibre;
    }

    public List<Voyage> getVoyage() {
        return voyage;
    }

    public void setVoyage(List<Voyage> voyage) {
        this.voyage = voyage;
    }
}
