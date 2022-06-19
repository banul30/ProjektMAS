package com.example.projektmas.MVCStructure.Controllers;

import com.example.projektmas.MVCStructure.Models.Bilet;
import com.example.projektmas.MVCStructure.Models.KontrolerBiletow;
import com.example.projektmas.MVCStructure.Models.Mandat;
import com.example.projektmas.MVCStructure.Models.Pasazer;
import com.example.projektmas.MVCStructure.Repositories.BiletRepository;
import com.example.projektmas.MVCStructure.Repositories.KontrolerBiletowRepository;
import com.example.projektmas.MVCStructure.Repositories.MandatRepository;
import com.example.projektmas.MVCStructure.Repositories.PasazerRepository;
import com.example.projektmas.MVCStructure.Services.KontrolerBiletowService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/mas")
@AllArgsConstructor
public class Kontroler_Mandat_Pasazer_Bilet_Controller {

    private final KontrolerBiletowRepository kontrolerBiletowRepository;
    private final MandatRepository mandatRepository;
    private final PasazerRepository pasazerRepository;
    private final BiletRepository biletRepository;
    private final KontrolerBiletowService kontrolerBiletowService;



    @PostMapping(path = "/kontroler/add")
    public ResponseEntity<Object> addKontroler(@RequestBody KontrolerBiletow kontrolerBiletow) {
        kontrolerBiletowRepository.save(kontrolerBiletow);
        return new ResponseEntity<>("dodano kontrolera", HttpStatus.CREATED);
    }

    @PostMapping(path = "/mandat/add")
    public ResponseEntity<Object> addKontroler(@RequestBody Mandat mandat) {
        mandatRepository.save(mandat);
        return new ResponseEntity<>("dodano mandat", HttpStatus.CREATED);
    }

    @PostMapping(path = "/pasazer/add")
    public ResponseEntity<Object> addKontroler(@RequestBody Pasazer pasazer) {
        pasazerRepository.save(pasazer);
        return new ResponseEntity<>("dodano pasazera", HttpStatus.CREATED);
    }

    @PostMapping(path ="/bilet/add")
    public ResponseEntity<Object> addKontroler(@RequestBody Bilet bilet) {
        biletRepository.save(bilet);
        return new ResponseEntity<>("dodano bilet", HttpStatus.CREATED);
    }









    @PostMapping(path="/kontroler/kontroluj")
    public ResponseEntity<Object> SkontrolujPasazera(@RequestBody Pasazer pasazer) {
        //logika kontroli z wykorzystamniem kontrolebiletowservice
        //db-backend-front
        return new ResponseEntity<>("skontrolowano", HttpStatus.OK);
    }

    @PostMapping(path="/kontroler/wystawMandat")
    public ResponseEntity<Object> WystawMandat(@RequestBody Mandat mandat) {
        //logika kontroli z wykorzystamniem kontrolebiletowservice może jakis mandatservice albo repository po prostu
        // komunikacja db-backend-front
        return new ResponseEntity<>("skontrolowano", HttpStatus.OK);
    }









}
