package com.example.demo.repositoris;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entities.Locateur;

public interface LocateurRepositori extends JpaRepository<Locateur, Integer> {

    Locateur findByEmail(String email);
    Locateur findById(Long id);
    List<Locateur> findByIdIn(List<Integer> locateurIds); // Custom query method to find by multiple IDs
   
//    @Query("SELECT l FROM Locateur l WHERE l.appartement IS NULL")
//    List<Locateur> findLocateursWithoutAppartement();
}

