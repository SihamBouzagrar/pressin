package com.sihamcode.pressin.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String telephone;
    private String localisation;
//Contructeur vide
    public Client() {}

    public Client(String nom, String telephone) {
        this.nom = nom;
        this.telephone = telephone;
    }

    // Getters et setters
    public Long getId() { return id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }
    public String getLocalisation(){ return localisation ;}
    public void setLocalisation (String localisation) { this.localisation =localisation;}
}

