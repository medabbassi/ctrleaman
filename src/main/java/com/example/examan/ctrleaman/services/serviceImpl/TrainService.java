package com.example.examan.ctrleaman.services.serviceImpl;

import com.example.examan.ctrleaman.entities.enums.Train;
import com.example.examan.ctrleaman.entities.enums.Ville;
import org.springframework.stereotype.Service;


public interface TrainService {

    public void ajouterTrain(Train train);
    public void affecterTrainAVoayge(Long codeTrain, Long codeVoayge);

    public  void trainsEnGare();

    public   void affecterTrainAVoyageur(long idVoyageur, Ville nomGareDepart, Ville nomGareArrivee, double heureDepart);

}
