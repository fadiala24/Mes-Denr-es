package com.example.apidenrees.Controller;

import com.example.apidenrees.Model.Administrateur;
import com.example.apidenrees.Model.Boutiques;
import com.example.apidenrees.ServiceImpl.BoutiqueServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/Boutique")
public class BoutiqueController {
    BoutiqueServiceImpl boutiqueServiceImpl;

    // ***************  Ajout d'un Boutique ***************

    @PostMapping("/addBoutique")
    public String saveBoutique(@RequestBody Boutiques boutiques){
        return this.boutiqueServiceImpl.aujout_boutique(boutiques);
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
}
