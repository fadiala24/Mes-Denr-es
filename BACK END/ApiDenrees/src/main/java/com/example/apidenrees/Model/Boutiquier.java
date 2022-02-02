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
    private String prenom;
    private int telephone;
    private String login;
    private String password;

    @JsonIgnore
    @OneToMany(mappedBy = "boutiquier")
    private List<Boutiques> boutique;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
