package it.ms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.ms.api.data.entity.Citta;
import it.ms.api.data.entity.Lista_Attivita;
import it.ms.api.data.entity.Luogo;
import it.ms.api.data.entity.Tipo_Luogo;
import it.ms.api.data.entity.Tutorial;
import it.ms.api.data.entity.Utente;
import it.ms.api.data.repo.CittaRepository;
import it.ms.api.data.repo.Lista_AttivitaRepository;
import it.ms.api.data.repo.LuogoRepository;
import it.ms.api.data.repo.PrenotazioneRepository;
import it.ms.api.data.repo.Tipo_LuogoRepository;
import it.ms.api.data.repo.TutorialRepository;
import it.ms.api.data.repo.UtenteRepository;

@RestController
@RequestMapping("dbProgetto")
public class TestController {

    @Autowired TutorialRepository tutorialRepo;
    @Autowired UtenteRepository utenteRepo;
    @Autowired CittaRepository cittaRepo;
    @Autowired LuogoRepository luogoRepo;
    @Autowired PrenotazioneRepository prenotazioneRepo;
    @Autowired Tipo_LuogoRepository tipo_LuogoRepo;
    @Autowired Lista_AttivitaRepository lista_AttivitaRepo;


    @GetMapping("list")
    public List<Tutorial> list() {
        return tutorialRepo.findAll();
    }



    
    @GetMapping("/utente/{id}")
    public Utente infoUtente(@PathVariable int id) {
        return utenteRepo.findById(id);
    }

    @GetMapping("/utente")
    public List<Utente> listaUtenti() {
        return utenteRepo.findAll();
    }



    @GetMapping("/citta/{id}")
    public Citta infoCitta(@PathVariable int cap){
        return cittaRepo.findByCAP(cap);
    }

    @GetMapping("/citta")
    public List<Citta> listaCitta() {
        return cittaRepo.findAll();
    }



    @GetMapping("/luogo/{id}")
    public Luogo infoLuogo(@PathVariable int id) {
        return luogoRepo.findById(id);
    }

    @GetMapping("/luogo")
    public List<Luogo> listaLuoghi() {
        return luogoRepo.findAll();
    }






    @GetMapping("/tipoluogo/{id}")
    public Tipo_Luogo infoTipo_Luogo(@PathVariable int id) {
        return tipo_LuogoRepo.findById(id);
    }

    @GetMapping("/tipoluogo")
    public List<Tipo_Luogo> listaTipo_Luogo() {
        return tipo_LuogoRepo.findAll();
    }



    @GetMapping("/listaattivita/{id}")
    public Lista_Attivita infoLista_Attivita(@PathVariable int id) {
        return lista_AttivitaRepo.findById(id);
    }

    @GetMapping("/listaattivita")
    public List<Lista_Attivita> lista_Attivita () {
        return lista_AttivitaRepo.findAll();
    }

    @GetMapping("/error")
    public String error() {
        return "Page not found";
    }

}
