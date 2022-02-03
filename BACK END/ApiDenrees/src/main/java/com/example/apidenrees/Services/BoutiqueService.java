package com.example.apidenrees.Services;

import com.example.apidenrees.Model.Administrateur;
import com.example.apidenrees.Model.Boutiques;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoutiqueService {
    public String aujout_boutique(Boutiques boutiques);
    public List<Boutiques> listBoutique();
    public Boutiques getBoutiqueById(Long id);
    public String supprimer_boutique(Long id);
    public String modifier_boutique(Boutiques boutiques, Long id);
    public List<Boutiques> getBoutiqueByVilleAndQuartier(String ville, String quartier);
    public Boutiques getBoutiqueByVille(String ville);
    public Boutiques getBoutiqueByQuartier(String quartier);
}
