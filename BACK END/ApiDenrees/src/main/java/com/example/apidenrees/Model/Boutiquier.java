package com.example.apidenrees.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Boutiquier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Boutiques> getBoutique() {
        return boutique;
    }

    public void setBoutique(List<Boutiques> boutique) {
        this.boutique = boutique;
    }

    private String prenom;
    private int telephone;
    private String login;
    private String password;

    @JsonIgnore
    @OneToMany(mappedBy = "boutiquier")
    private List<Boutiques> boutique;

    public Produits getProduits() {
        return produits;
    }

    public void setProduits(Produits produits) {
        this.produits = produits;
    }

    @ManyToOne
    private Produits produits;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
