package com.example.apidenrees.Repositories;

import com.example.apidenrees.Model.Boutiques;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoutiqueRepository extends JpaRepository<Boutiques, Long> {
}
