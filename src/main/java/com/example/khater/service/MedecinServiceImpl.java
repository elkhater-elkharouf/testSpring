package com.example.khater.service;

import com.example.khater.entites.Clinique;
import com.example.khater.entites.Medecin;
import com.example.khater.repository.CliniqueRepository;
import com.example.khater.repository.MedecinRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MedecinServiceImpl implements IMedecinService{
    MedecinRepository medecinRepository ;
    CliniqueRepository cliniqueRepository ;
    @Override
    public Medecin addMedecinAndAssignToClinique(Medecin medecin, Long idClinique) {
        Clinique c =cliniqueRepository.findById(idClinique).orElse(null);
        medecin.getClinique().add(c);
        return medecinRepository.save(medecin);
    }
}
