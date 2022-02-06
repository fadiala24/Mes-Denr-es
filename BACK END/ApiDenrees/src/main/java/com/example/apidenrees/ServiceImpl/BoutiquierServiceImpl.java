package com.example.apidenrees.ServiceImpl;


import com.example.apidenrees.Model.Boutiques;
import com.example.apidenrees.Model.Boutiquier;
import com.example.apidenrees.Repositories.BoutiquierRepository;
import com.example.apidenrees.Services.BoutiquierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BoutiquierServiceImpl implements BoutiquierService {
    @Autowired
    BoutiquierRepository boutiquierRepository;

    @Override
    public String aujout_boutiquier(Boutiquier boutiquier) {
        boutiquierRepository.save(boutiquier);
        return "Ajout effectué avec succes";
    }

    @Override
    public List<Boutiquier> listBoutiquier() {
        return boutiquierRepository.findAll();
    }

    @Override
    public Boutiquier getBoutiquierById(Long id) {
        return boutiquierRepository.findById(id).get();
    }

    @Override
    public String supprimer_boutiquier(Long id) {
        Boutiquier boutiquier = boutiquierRepository.findById(id).get();
        return "Vous avez supprimer la Boutique "+boutiquier.getNom()+" "+boutiquier.getPrenom();

    }

    @Override
    public String modifier_boutiquier(Boutiquier boutiquier, Long id) {
        Boutiquier boutiquierExistant = this.boutiquierRepository.findById(id).get();

        boutiquierExistant.setNom(boutiquier.getNom());
        boutiquierExistant.setPrenom(boutiquier.getPrenom());
        boutiquierExistant.setLogin(boutiquier.getLogin());
        boutiquierExistant.setPassword(boutiquier.getPassword());
        boutiquierExistant.setTelephone(boutiquier.getTelephone());
        return "Boutique modifiée avec succes";
    }
}
