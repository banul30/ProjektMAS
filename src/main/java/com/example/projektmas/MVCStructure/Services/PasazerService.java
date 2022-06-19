package com.example.projektmas.MVCStructure.Services;

import com.example.projektmas.MVCStructure.Models.Pasazer;
import com.example.projektmas.MVCStructure.Repositories.PasazerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasazerService {
    private final PasazerRepository pasazerRepository;

    public PasazerService(PasazerRepository pasazerRepository) {
        this.pasazerRepository = pasazerRepository;
    }

    public List<Pasazer> getAllPasazer() {
        return pasazerRepository.findAll();
    }

    public Pasazer getPasazerById(Long id) {
        return pasazerRepository.getReferenceById(id);
    }
}
