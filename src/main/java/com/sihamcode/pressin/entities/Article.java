package com.sihamcode.pressin.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
@Table (name= "Article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private Double Prix;
    private String Description;
//Contructeur vide
    public Article() {}

    public Article(String nom,Double Prix, String Description) {
        this.nom = nom;
        this.Prix = Prix;
        this.Description=Description;
    }

    // Getters et setters
    public Long getId() { return id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public Double getPrix() { return Prix; }
    public void setPrix(Double Prix) { this.Prix =Prix; }
    public String getDescription(){ return Description ;}
    public void setDescription (String Description) { this.Description=Description;}
}

