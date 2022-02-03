package com.example.apidenrees.Repositories;

import com.example.apidenrees.Model.Produits;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepositry extends JpaRepository<Produits, Long> {
}
