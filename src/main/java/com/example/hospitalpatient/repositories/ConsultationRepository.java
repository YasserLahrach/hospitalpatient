package com.example.hospitalpatient.repositories;

import com.example.hospitalpatient.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
