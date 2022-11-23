package com.example.khater.controller;

import com.example.khater.entites.Clinique;
import com.example.khater.service.ICliniqueService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

public class CliniqueController {
    ICliniqueService iCliniqueService ;
    @PostMapping("/addClinique")
    @ResponseBody
    public Clinique addClinique(@RequestBody Clinique clinique ) {
        return iCliniqueService.addClinique(clinique) ;
    }
}
