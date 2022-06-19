package com.example.projektmas.MVCStructure.Controllers;

import com.example.projektmas.MVCStructure.DTOs.MandatInputData;
import com.example.projektmas.MVCStructure.Models.Mandat;
import com.example.projektmas.MVCStructure.Models.Pasazer;
import com.example.projektmas.MVCStructure.Repositories.MandatRepository;
import com.example.projektmas.MVCStructure.Services.MandatService;
import com.example.projektmas.MVCStructure.Services.PasazerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path = "api/gui")
public class WystawMandatController {
    private final MandatService mandatService;

    public WystawMandatController(MandatService mandatService) {
        this.mandatService = mandatService;
    }

    @GetMapping(path = "/mandat/add")
    public String showMandatForm(Model model) {

        MandatInputData mandatInputData = new MandatInputData();
        model.addAttribute("mandatInputData",mandatInputData);

         return "wystawMandat2";
    }

    @PostMapping(path = "/mandat/add")
    public String addMandat(MandatInputData mandatInputData) {

        mandatService.wystawMandat(mandatInputData);
        System.out.println(mandatInputData);
        return "dodanoMandat";

    }
}
