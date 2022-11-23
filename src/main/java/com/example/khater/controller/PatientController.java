package com.example.khater.controller;

import com.example.khater.entites.Clinique;
import com.example.khater.entites.Patient;
import com.example.khater.service.IPatientService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

public class PatientController {
    IPatientService iPatientService ;
    @PostMapping("/addPatient")
    @ResponseBody
    public Patient addPatient(@RequestBody Patient patient ) {
        return iPatientService.addPatient(patient) ;
    }
}
