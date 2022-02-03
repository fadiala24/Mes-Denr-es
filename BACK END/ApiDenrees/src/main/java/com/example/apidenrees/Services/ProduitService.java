package com.example.apidenrees.Services;

import com.example.apidenrees.Model.Administrateur;
import com.example.apidenrees.Model.Produits;

import java.util.List;

public interface ProduitService {
    public String ajout_Produit(Produits produits);
    public List<Produits> listProduit();
    public Produits getProduitById(Long id);
    public String supprimer_produit(Long id);
    public String modifier_produit(Produits produits, Long id);
}
