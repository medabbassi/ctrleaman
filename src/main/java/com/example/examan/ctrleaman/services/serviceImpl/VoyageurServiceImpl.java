package com.example.examan.ctrleaman.services.serviceImpl;

import com.example.examan.ctrleaman.entities.enums.Voyageur;
import com.example.examan.ctrleaman.repositories.VoyageurRepository;
import org.springframework.stereotype.Service;

@Service
public class VoyageurServiceImpl  implements VoyageurService{
    final  private VoyageurRepository voyageurRepo;

    public VoyageurServiceImpl(VoyageurRepository voyageurRepo) {
        this.voyageurRepo = voyageurRepo;
    }

    @Override
    public void ajouterVoyageur(Voyageur voyageur) {

    }
}
