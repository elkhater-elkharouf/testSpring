package com.example.khater.service;

import com.example.khater.entites.Clinique;
import com.example.khater.repository.CliniqueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CliniqueServiceImpl implements ICliniqueService {
    CliniqueRepository cliniqueRepository ;
    @Override
    public Clinique addClinique(Clinique clinique) {
        return cliniqueRepository.save(clinique);
    }
}
