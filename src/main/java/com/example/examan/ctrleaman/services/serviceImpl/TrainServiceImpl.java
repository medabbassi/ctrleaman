package com.example.examan.ctrleaman.services.serviceImpl;

import com.example.examan.ctrleaman.entities.enums.Train;
import com.example.examan.ctrleaman.entities.enums.Ville;
import com.example.examan.ctrleaman.entities.enums.Voyage;
import com.example.examan.ctrleaman.repositories.TrainRepository;
import com.example.examan.ctrleaman.repositories.VoyageRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrainServiceImpl  implements TrainService{

    public  final TrainRepository trainRepo;
    public  final VoyageRepository voyageRepo;
    public TrainServiceImpl(TrainRepository trainRepo, VoyageRepository voyageRepo) {
        this.trainRepo = trainRepo;
        this.voyageRepo = voyageRepo;
    }

    @Override
    public void ajouterTrain(Train train) {
        trainRepo.save(train);

    }

    @Override
    public void affecterTrainAVoayge(Long codeTrain, Long codeVoayge) {
        Voyage voyage = voyageRepo.findByCodeVoyage(codeVoayge);
        Train train = trainRepo.findByCodeTrain(codeTrain);
        train.setVoyage((List<Voyage>) voyage);
        trainRepo.save(train);
    }
    // this methode is scheduled to show all trains when hour of
    // departure is under 8 of the mornings
    @Scheduled(cron = "0 0 8 * * *")
    @Override
    public void trainsEnGare() {
        List<Train> trains = (List<Train>) trainRepo.findAll();
        for (Train train : trains) {
            System.out.println(train);
        }

    }

    @Override
    public void affecterTrainAVoyageur(long idVoyageur, Ville nomGareDepart, Ville nomGareArrivee, double heureDepart) {

    }


}
