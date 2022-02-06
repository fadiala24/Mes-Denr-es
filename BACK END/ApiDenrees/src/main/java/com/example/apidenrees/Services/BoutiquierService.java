package com.example.apidenrees.Services;

import com.example.apidenrees.Model.Boutiques;
import com.example.apidenrees.Model.Boutiquier;

import java.util.List;

public interface BoutiquierService {

    public String aujout_boutiquier(Boutiquier boutiquier);
    public List<Boutiquier> listBoutiquier();
    public Boutiquier getBoutiquierById(Long id);
    public String supprimer_boutiquier(Long id);
    public String modifier_boutiquier(Boutiquier boutiquier, Long id);
}
