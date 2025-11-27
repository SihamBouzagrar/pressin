
package com.sihamcode.pressin.repositories;
import com.sihamcode.pressin.entities.Client;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<Client, Long> {
    //find
    Client findByNom(String nom);
    List<Client> findByNomAndLocalisation(String nom, String localisation);
    List<Client> findByNomOrTelephone(String nom, String telephone);
    //comptage
    long countByNom(String nom);
    // Vérification d'existence
    boolean existsByEmail(String email);
    
    List<Client> findByNomContainingIgnoreCase(String nom);
List<Client> findAllByOrderByIdAsc();

}
