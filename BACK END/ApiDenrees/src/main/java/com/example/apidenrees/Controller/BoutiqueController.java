package com.example.apidenrees.Controller;

import com.example.apidenrees.Model.Administrateur;
import com.example.apidenrees.Model.Boutiques;
import com.example.apidenrees.ServiceImpl.BoutiqueServiceImpl;
import com.example.apidenrees.Services.BoutiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/Boutique")
public class BoutiqueController {
   @Autowired
    BoutiqueService boutiqueService;

   @Autowired
   BoutiqueServiceImpl boutiqueServiceImpl;
    // ***************  Ajout d'un Boutique ***************

    @PostMapping("/addBoutique")
    public String saveBoutique(@RequestBody Boutiques boutiques){
        return boutiqueService.aujout_boutique(boutiques);
    }

    // ******************** Liste des Boutiques

    @GetMapping("/listBoutique")
    List<Boutiques> listBoutique(){
        return this.boutiqueServiceImpl.listBoutique();
    }

    // ************************* Affichage par Boutique *****************

    @GetMapping("/infoBoutique/{id}")
    public Boutiques getBoutiqueById(@PathVariable Long id) {
        return this.boutiqueServiceImpl.getBoutiqueById(id);
    }

    // ************************* Suppression de Boutique ***************

    @DeleteMapping("/deleteBoutique/{id}")
    public String delete(@PathVariable Long id){
        return this.boutiqueServiceImpl.supprimer_boutique(id);
    }

    // ************************  Modification de Boutique ***************
    @PutMapping("/updateBoutique/{id}")
    public String updateBoutique(@PathVariable Long id, @RequestBody Boutiques boutiques){
        return this.boutiqueServiceImpl.modifier_boutique(boutiques, id);
    }

    // **************************** Affichage de la Boutique Par quartier et par ville ***************
   @GetMapping("/getBoutiqueByVille&Quartier/ville={ville}&quartier={quartier}")
    List<Boutiques> getBoutiquesByVilleAndQuartier(@PathVariable String ville, @PathVariable String quartier) {
        return boutiqueServiceImpl.getBoutiqueByVilleAndQuartier(ville,quartier);
    }

    // ****************************** Affichage de la boutique par quartier ********************
    @GetMapping("/getBoutiqueByQuartier/quartier={quartier}")
    List <Boutiques> getBoutiquesByQuartier(@PathVariable String quartier) {
        return boutiqueServiceImpl.getBoutiqueByQuartier(quartier);
    }
    // *********************************** Affichage de la boutique ville ********************
   @GetMapping("/getBoutiqueByVille/ville={ville}")
    List<Boutiques> getBoutiquesByVille(@PathVariable String ville) {
        return this.boutiqueServiceImpl.getBoutiqueByVille(ville);
    }

}
