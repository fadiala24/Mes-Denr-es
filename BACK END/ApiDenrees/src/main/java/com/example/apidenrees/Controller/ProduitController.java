package com.example.apidenrees.Controller;

import com.example.apidenrees.Model.Administrateur;
import com.example.apidenrees.Model.Produits;
import com.example.apidenrees.ServiceImpl.AdminServiceImpl;
import com.example.apidenrees.ServiceImpl.ProduitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/Produit")
public class ProduitController {

    @Autowired
     ProduitServiceImpl produitServiceImpl;

    // ***************  Ajout d'un Produit ***************

    @PostMapping("/addProduit")
    public String saveProduit(@RequestBody Produits produits){
        return this.produitServiceImpl.ajout_Produit(produits);
    }

    // ******************** Liste des Produits

    @GetMapping("/listProduit")
    List<Produits> listProduit(){
        return this.produitServiceImpl.listProduit();
    }

    // ************************* Affichage par Produit *****************

    @GetMapping("/infoProduit/{id}")
    public Produits getPrdoduitById(@PathVariable Long id) {
        return this.produitServiceImpl.getProduitById(id);
    }

    // ************************* Suppression de Produit***************

    @DeleteMapping("/deleteProduit/{id}")
    public String delete(@PathVariable Long id){
        return this.produitServiceImpl.supprimer_produit(id);
    }

    // ************************  Modification de Produit ***************
    @PutMapping("/updateProduit/{id}")
    public String updateProduit(@PathVariable Long id, @RequestBody Produits produits){
        return this.produitServiceImpl.modifier_produit(produits, id);
    }

}
