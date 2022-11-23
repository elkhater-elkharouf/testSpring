package com.example.khater.service;

import com.example.khater.entites.RendezVous;
import com.example.khater.entites.Specialite;

import java.util.List;

public interface IRendezVousService {
    public void addRDVAndAssignMedAndPatient(RendezVous rdv , Long idMedecin , Long idPatient) ;
    public List<RendezVous>getRendezVousByCliniqueAndSpecialite(Long idClinique , Specialite specialite) ;
    public int getRendezVousMedecin(Long idMedecin) ;
}
