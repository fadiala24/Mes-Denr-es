package com.example.apidenrees.Repositories;

import com.example.apidenrees.Model.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Administrateur, Long> {

    //  ******** Optional permet d'eviter les doublons sur le meme attribut d'une table
    Optional<Administrateur> findByTelephone(int telephone);
    Optional<Administrateur> findByEmail(String email);
}
