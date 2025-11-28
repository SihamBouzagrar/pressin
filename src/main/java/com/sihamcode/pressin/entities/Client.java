package com.sihamcode.pressin.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Client")

@Getter
@Setter
@Builder // pour construire diff type de constructeur
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String nom;
    @Column(unique = true, nullable = false, length = 20)
    private String telephone;
    @Column(length = 200)
    private String localisation;

    // Contructeur vide
    public Client() {
    }

    public Client(String nom, String telephone) {
        this.nom = nom;
        this.telephone = telephone;
    }

    // Getters et setters
    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    @Override
    public String toString() {
        return "Client{id=" + id + ", nom='" + nom + "', telephone='" + telephone + "'}";
    }

  
}
