package com.example.khater.repository;

import com.example.khater.entites.Clinique;
import com.example.khater.entites.RendezVous;
import com.example.khater.entites.Specialite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface RendezVousRepository extends JpaRepository<RendezVous, Long> {
    @Query("SELECT rdv FROM RendezVous rdv , Clinique clinique , Medecin medecin where clinique.idClinique=? 1  and medecin.specialite =? 2 ")
    List<RendezVous> getRendezVousByCliniqueAndSpecialite( @PathVariable("idClinique") Long idClinique, @PathVariable("specialite") Specialite specialite) ;
    /*@Query("select rdv from RendezVous rdv , Medecin medecin where medecin.idMedecin=?1")
    findRendezVousByMedecinIdMedecin(@PathVariable("idMedecin") Long idMedecin);*/
}
