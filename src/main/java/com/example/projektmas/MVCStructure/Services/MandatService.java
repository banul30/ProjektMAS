package com.example.projektmas.MVCStructure.Services;

import com.example.projektmas.MVCStructure.DTOs.MandatInputData;
import com.example.projektmas.MVCStructure.Models.KontrolerBiletow;
import com.example.projektmas.MVCStructure.Models.Mandat;
import com.example.projektmas.MVCStructure.Models.Pasazer;
import com.example.projektmas.MVCStructure.Repositories.MandatRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class MandatService {
    private final PasazerService pasazerService;
    private final MandatRepository mandatRepository;
    private final KontrolerBiletowService kontrolerBiletowService;


    public MandatService(PasazerService pasazerService, MandatRepository mandatRepository, KontrolerBiletowService kontrolerBiletowService) {
        this.pasazerService = pasazerService;
        this.mandatRepository = mandatRepository;
        this.kontrolerBiletowService = kontrolerBiletowService;
    }

    public void wystawMandat(MandatInputData mandatInputData) {

        Pasazer p1 = pasazerService.getPasazerById(mandatInputData.getIdPasazer());
        KontrolerBiletow k1 = kontrolerBiletowService.getKontrolerBiletowById(mandatInputData.getIdKontroler());

        int nextId = mandatRepository.getNextMandatId();

            Mandat m1 = new Mandat((long) nextId,mandatInputData.getKwota(),mandatInputData.isCzyOplacony(), Instant.now(),k1,p1);

            mandatRepository.save(m1);


    }
}
