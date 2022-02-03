package com.example.apidenrees.Services;

import com.example.apidenrees.Model.Boutiques;
import com.example.apidenrees.Model.ProduitBoutique;

public interface ProduitBoutiqueService {

    public ProduitBoutique getBoutiqueByQuartierAndCategory(String quartier, String category);
}
