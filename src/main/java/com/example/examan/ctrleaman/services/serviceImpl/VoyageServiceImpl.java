package com.example.examan.ctrleaman.services.serviceImpl;

import com.example.examan.ctrleaman.entities.enums.Voyage;
import com.example.examan.ctrleaman.repositories.VoyageRepository;
import org.springframework.stereotype.Service;

@Service
public class VoyageServiceImpl  implements  VoyageService{

    public  final VoyageRepository voyageRepo;

    public VoyageServiceImpl(VoyageRepository voyageRepo) {
        this.voyageRepo = voyageRepo;
    }

    @Override
    public void ajouterVoyage(Voyage voyage) {
        voyageRepo.save(voyage);

    }
}
