package com.example.khater.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idEtudiant; // Clé primaire
    private String prenomE;
    private String nomE;
}
