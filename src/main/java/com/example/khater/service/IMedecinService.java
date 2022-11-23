package com.example.khater.service;

import com.example.khater.entites.Medecin;

public interface IMedecinService {
    public Medecin addMedecinAndAssignToClinique(Medecin medecin , Long idClinique) ;
}
