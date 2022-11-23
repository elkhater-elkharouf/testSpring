package com.example.khater.service;

import com.example.khater.entites.Patient;
import com.example.khater.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PatientServiceImpl implements IPatientService{
    PatientRepository patientRepository ;
    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }
}
