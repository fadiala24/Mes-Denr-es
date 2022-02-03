package com.example.apidenrees.ServiceImpl;

import com.example.apidenrees.Model.Administrateur;
import com.example.apidenrees.Model.Boutiques;
import com.example.apidenrees.Repositories.BoutiqueRepository;
import com.example.apidenrees.Services.BoutiqueService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BoutiqueServiceImpl implements BoutiqueService {
    @Autowired
    BoutiqueRepository boutiqueRepository;

    @Override
    public String aujout_boutique(Boutiques boutiques) {
        boutiqueRepository.save(boutiques);
        return "Ajout effectué avec succes";
    }

    @Override
    public List<Boutiques> listBoutique() {
        return boutiqueRepository.findAll();
    }

    @Override
    public Boutiques getBoutiqueById(Long id) {
        return boutiqueRepository.findById(id).get();
    }

    @Override
    public String supprimer_boutique(Long id) {
        Boutiques boutiques = boutiqueRepository.findById(id).get();
        return "Vous avez supprimer la Boutique "+boutiques.getNom()+" de "+boutiques.getQuartier();

    }

    @Override
    public String modifier_boutique(Boutiques boutiques, Long id) {
        Boutiques boutiqueExistant = this.boutiqueRepository.findById(id).get();

        boutiqueExistant.setNom(boutiques.getNom());
        boutiqueExistant.setAdresse(boutiques.getAdresse());
        boutiqueExistant.setVille(boutiques.getVille());
        boutiqueExistant.setPhoto(boutiques.getPhoto());
        boutiqueExistant.setQuartier(boutiques.getQuartier());
        return "Boutique modifiée avec succes";
    }
}
