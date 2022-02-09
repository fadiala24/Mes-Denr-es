package com.example.apidenrees.ServiceImpl;

import com.example.apidenrees.Model.Administrateur;
import com.example.apidenrees.Model.Produits;
import com.example.apidenrees.Repositories.BoutiqueRepository;
import com.example.apidenrees.Repositories.ProduitRepositry;
import com.example.apidenrees.Services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProduitServiceImpl implements ProduitService {
    @Autowired
    ProduitRepositry produitRepositry;

    @Override
    public String ajout_Produit(Produits produits) {
        produitRepositry.save(produits);
        return "Ajout effectué avec succes";
    }

    @Override
    public List<Produits> listProduit() {
        return produitRepositry.findAll();
    }

    @Override
    public Produits getProduitById(Long id) {
        return produitRepositry.findById(id).get();
    }

    @Override
    public String supprimer_produit(Long id) {
        this.produitRepositry.deleteById(id);
        return "Vous avez supprimer le produit ";
    }

    @Override
    public String modifier_produit(Produits produits, Long id) {
        Produits produitExistant = this.produitRepositry.findById(id).get();

        produitExistant.setNom(produits.getNom());
        produitExistant.setCategory(produits.getCategory());
        produitExistant.setQuantite(produits.getQuantite());
        produitExistant.setPrix_unitaire(produits.getPrix_unitaire());
        produitExistant.setPhotos(produits.getPhotos());
        return " Produits modifié avec succes";
    }
}
