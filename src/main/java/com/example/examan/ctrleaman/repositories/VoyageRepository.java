package com.example.examan.ctrleaman.repositories;

import com.example.examan.ctrleaman.entities.enums.Voyage;
import org.springframework.data.repository.CrudRepository;

public interface VoyageRepository extends CrudRepository<Voyage, Long> {


    public  Voyage findByCodeVoyage(Long codeVoyage);
}
