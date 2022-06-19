package com.example.projektmas.MVCStructure.Services;

import com.example.projektmas.MVCStructure.Models.KontrolerBiletow;
import com.example.projektmas.MVCStructure.Repositories.KontrolerBiletowRepository;
import org.springframework.stereotype.Service;

@Service
public class KontrolerBiletowService {

    private final KontrolerBiletowRepository kontrolerBiletowRepository;

    public KontrolerBiletowService(KontrolerBiletowRepository kontrolerBiletowRepository) {
        this.kontrolerBiletowRepository = kontrolerBiletowRepository;
    }

    public KontrolerBiletow getKontrolerBiletowById(Long id) {

        return kontrolerBiletowRepository.getReferenceById(id);
    }


}
