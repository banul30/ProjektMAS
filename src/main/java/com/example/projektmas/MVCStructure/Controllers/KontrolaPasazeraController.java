package com.example.projektmas.MVCStructure.Controllers;
import com.example.projektmas.MVCStructure.Models.Pasazer;
import com.example.projektmas.MVCStructure.Services.PasazerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping(path = "api/gui")

public class KontrolaPasazeraController {

private final PasazerService pasazerService;
    public KontrolaPasazeraController(PasazerService pasazerService) {
        this.pasazerService = pasazerService;
    }

    @GetMapping(path = "/pasazer/get")
    public String getPasazer(Model model) {
        model.addAttribute("name", "Piotrek");
        List<Pasazer> Pasazerowie = pasazerService.getAllPasazer();
        model.addAttribute("pasazerowie", Pasazerowie);
        return "list";
    }
}
