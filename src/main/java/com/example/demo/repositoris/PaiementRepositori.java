package com.example.demo.repositoris;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entities.Paiement;

public interface PaiementRepositori extends JpaRepository<Paiement, Long> {

	List<Paiement> findByAppartement_Id(int i);
    // You can add custom query methods here if needed
}
