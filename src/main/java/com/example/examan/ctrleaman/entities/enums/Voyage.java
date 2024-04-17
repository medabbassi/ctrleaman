package com.example.examan.ctrleaman.entities.enums;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Voyage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long idVoyage;
    private long  codeVoyage;
    @Enumerated(EnumType.STRING)
    private Ville gareDepart;
    @Enumerated(EnumType.STRING)
    private Ville gareArrivee;
    private  double heureDepart;
    private  double heureArrivee;
    private LocalDate dateDepart;
    private LocalDate dateArrivee;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "voyage_voyageur",
            joinColumns = @JoinColumn(name = "id_voyage"),
            inverseJoinColumns = @JoinColumn(name = "id_voyageur"))
    private List<Voyageur> voyageur = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_train")
    private Train train;

    public long getIdVoyage() {
        return idVoyage;
    }

    public void setIdVoyage(long idVoyage) {
        this.idVoyage = idVoyage;
    }

    public long getCodeVoyage() {
        return codeVoyage;
    }

    public void setCodeVoyage(long codeVoyage) {
        this.codeVoyage = codeVoyage;
    }

    public Ville getGareDepart() {
        return gareDepart;
    }

    public void setGareDepart(Ville gareDepart) {
        this.gareDepart = gareDepart;
    }

    public Ville getGareArrivee() {
        return gareArrivee;
    }

    public void setGareArrivee(Ville gareArrivee) {
        this.gareArrivee = gareArrivee;
    }

    public double getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(double heureDepart) {
        this.heureDepart = heureDepart;
    }

    public double getHeureArrivee() {
        return heureArrivee;
    }

    public void setHeureArrivee(double heureArrivee) {
        this.heureArrivee = heureArrivee;
    }

    public LocalDate getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(LocalDate dateDepart) {
        this.dateDepart = dateDepart;
    }

    public LocalDate getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(LocalDate dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public List<Voyageur> getVoyageur() {
        return voyageur;
    }

    public void setVoyageur(List<Voyageur> voyageur) {
        this.voyageur = voyageur;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
}
