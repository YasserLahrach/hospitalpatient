package com.example.hospitalpatient.service;

import com.example.hospitalpatient.entities.Consultation;
import com.example.hospitalpatient.entities.Medecin;
import com.example.hospitalpatient.entities.Patient;
import com.example.hospitalpatient.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRendezVous(RendezVous rendezVous);

    RendezVous saveDRDV(RendezVous rendezVous);

    Consultation saveConsultation(Consultation consultation);
}
