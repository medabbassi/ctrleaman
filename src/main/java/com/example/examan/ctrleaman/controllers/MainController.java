package com.example.examan.ctrleaman.controllers;


import com.example.examan.ctrleaman.entities.enums.Train;
import com.example.examan.ctrleaman.entities.enums.Ville;
import com.example.examan.ctrleaman.entities.enums.Voyage;
import com.example.examan.ctrleaman.entities.enums.Voyageur;
import com.example.examan.ctrleaman.repositories.TrainRepository;
import com.example.examan.ctrleaman.services.serviceImpl.TrainService;
import com.example.examan.ctrleaman.services.serviceImpl.VoyageService;
import com.example.examan.ctrleaman.services.serviceImpl.VoyageurService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MainController {

private  final VoyageService voyageService;
private final TrainService trainService;
private final VoyageurService voyageurService;
private  final TrainRepository trainRepo;

 MainController (VoyageService voyageService, TrainService trainService, VoyageurService voyageurService, TrainRepository trainRepo){
    this.voyageService = voyageService;
    this.trainService = trainService;
    this.voyageurService = voyageurService;

     this.trainRepo = trainRepo;
 }


        @PostMapping(value = "/addVoyage", consumes = "application/json")
        public void addVoyage(@RequestBody Voyage voyage){
            voyageService.ajouterVoyage(voyage);
        }

        @PostMapping("/addTrain")
        public void addTrain(@RequestBody Train train){
            trainService.ajouterTrain(train);
        }
        @PostMapping("/affecterTrainAVoyage")
        public void affecterTrainAVoyage(@RequestBody Long codeTrain, Long codeVoyage){
            trainService.affecterTrainAVoayge(codeTrain, codeVoyage);
        }

        @PostMapping("/addVoyageur")
        public void addVoyageur(@RequestBody Voyageur voyageur){
            voyageurService.ajouterVoyageur(voyageur);
        }
        @GetMapping("/nbrPlacesLibres")
        public int trainsEnGare(@RequestBody  Ville  ville){
       return       trainRepo.trainPlacesLibresMEANS(ville);
        }



}
