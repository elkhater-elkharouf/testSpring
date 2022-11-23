package com.example.khater.controller;

import com.example.khater.entites.Clinique;
import com.example.khater.entites.Medecin;
import com.example.khater.service.IMedecinService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

public class MedecinController {
    IMedecinService iMedecinService;

    @PostMapping("/addAndAssignEtudiantToEquipeAndContract/{idClinique}")
    @ResponseBody
    public Medecin addMedecinAndAssignToClinique(@RequestBody Medecin medecin, @PathVariable("idClinique") long idClinique) {

        return iMedecinService.addMedecinAndAssignToClinique(medecin, idClinique);

    }
}
