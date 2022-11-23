package com.example.khater.controller;

import com.example.khater.entites.RendezVous;
import com.example.khater.entites.Specialite;
import com.example.khater.service.IRendezVousService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class RendezVousController {
    IRendezVousService iRendezVousService;

    @PostMapping("/addRDVAndAssignMedAndPatient/{idMedecin}/{idPatient}")
    @ResponseBody
    @JsonIgnore
    public void addRDVAndAssignMedAndPatient(@RequestBody RendezVous rdv, @PathVariable("idMedecin") long idMedecin, @PathVariable("idPatient") long idPatient) {

        iRendezVousService.addRDVAndAssignMedAndPatient(rdv, idMedecin, idPatient);

    }

    @GetMapping("/getRendezVousByCliniqueAndSpecialite/{idClinique}/{specialite}")
    @ResponseBody
    @JsonIgnore
    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(@PathVariable("idClinique") long idClinique, @PathVariable("specialite")Specialite specialite ){
        return iRendezVousService.getRendezVousByCliniqueAndSpecialite(idClinique,specialite) ;
    }
    @GetMapping("/getRendezVousMedecin/{idMedecin}")
    @ResponseBody
    @JsonIgnore
    public int getRendezVousMedecin(@PathVariable("idMedecin") long idMedecin ){
        return iRendezVousService.getRendezVousMedecin(idMedecin);
}}
