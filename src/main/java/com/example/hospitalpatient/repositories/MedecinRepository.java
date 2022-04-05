package com.example.hospitalpatient.repositories;

import com.example.hospitalpatient.entities.Medecin;
import com.example.hospitalpatient.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    Medecin findByNom(String nom);
}
