package com.example.khater.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RendezVous implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idRDV;
    private Date date ;
    private String remarque ;
    @ManyToOne
    @JsonIgnore
    private Medecin medecin ;
    @ManyToOne
    @JsonIgnore
    private Patient patient ;
}
