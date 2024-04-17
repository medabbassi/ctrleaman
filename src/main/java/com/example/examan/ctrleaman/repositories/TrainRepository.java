package com.example.examan.ctrleaman.repositories;

import com.example.examan.ctrleaman.entities.enums.Train;
import com.example.examan.ctrleaman.entities.enums.Ville;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TrainRepository  extends CrudRepository<Train, Long> {


        public  Train findByCodeTrain(Long codeTrain);
       // @Query("select t from Train t  join  t.voyageurs v  join   where   ?1")
        public   void affecterTrainAVoyageur(long idVoyageur, Ville nomGareDepart, Ville nomGareArrivee, double heureDepart);

        // afficher le nombre moyenne de place  libres dans tous les trains qui ont comme gare de depart "TUNIS"
        @Query("select avg(t.nbPlaceLibre) from Train t  join  Voyage  v where  v.gareArrivee= 'TUNIS'")
        public int trainPlacesLibresMEANS(Ville gareDepart);

}
