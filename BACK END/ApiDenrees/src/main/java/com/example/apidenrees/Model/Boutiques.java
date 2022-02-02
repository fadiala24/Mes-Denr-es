package com.example.apidenrees.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Boutiques {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nom;
    private String adresse;
    private String ville;
    private String quartier;
    private String photo;

    @ManyToMany
    private List<Administrateur> administrateurs;

    @ManyToOne
    private Boutiquier boutiquier;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
