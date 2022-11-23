package com.example.khater.service;

import com.example.khater.entites.*;
import com.example.khater.repository.CliniqueRepository;
import com.example.khater.repository.MedecinRepository;
import com.example.khater.repository.PatientRepository;
import com.example.khater.repository.RendezVousRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RendezVousServiceImpl implements IRendezVousService{
    RendezVousRepository rendezVousRepository ;
    MedecinRepository medecinRepository ;
    PatientRepository patientRepository ;
    CliniqueRepository cliniqueRepository ;
    @Override
    public void addRDVAndAssignMedAndPatient(RendezVous rdv, Long idMedecin, Long idPatient) {
        Medecin m=medecinRepository.findById(idMedecin).orElse(null) ;
        Patient p=patientRepository.findById(idPatient).orElse(null) ;
        rdv.setMedecin(m);
        rdv.setPatient(p);
        rendezVousRepository.save(rdv) ;


    }

    @Override
    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(Long idClinique, Specialite specialite) {


        return getRendezVousByCliniqueAndSpecialite(idClinique,specialite);
    }

    @Override
    public int getRendezVousMedecin(Long idMedecin) {
        int nb=0 ;
        List<RendezVous> rdv=rendezVousRepository.
                for(RendezVous rendezVous:rdv)

        return nb;
    }
}
