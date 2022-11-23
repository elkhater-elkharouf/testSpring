package com.example.khater.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Medecin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idMedecin ;
    private String nomMedecin ;
    @Enumerated(EnumType.STRING)
    private Specialite specialite ;
    private Integer telephone  ;
    private Integer prixConsultation  ;
    @ManyToMany
    @JsonIgnore
    private Set<Clinique> clinique ;
    @OneToMany(mappedBy = "medecin",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<RendezVous> rendezVous ;
}
