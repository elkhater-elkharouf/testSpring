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
public class Clinique implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idClinique;
    private String nomClinique ;
    private String adresse ;
    private Integer telephone ;
    @ManyToMany(mappedBy = "clinique", cascade = CascadeType.PERSIST)
    @JsonIgnore
    private Set<Medecin> medecin ;

}
