package com.sihamcode.pressin.controllers;

import com.sihamcode.pressin.entities.Client;
import com.sihamcode.pressin.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
@CrossOrigin(origins = "*")  // Pour permettre les requêtes depuis le frontend
public class ClientController {
    
    @Autowired
    private ClientService clientService;
    
    /*  Test de connexion
    @GetMapping("/test")
    public ResponseEntity<String> test() {
        long count = clientService.countByNom();
        return ResponseEntity.ok("✅ Connexion à pressin_db réussie ! Nombre de clients : " + count);
    }
    */
    // Récupérer tous les clients
    @GetMapping
    public ResponseEntity<List<Client>> getAllClients() {
        List<Client> clients = clientService.getAllClients();
        return ResponseEntity.ok(clients);
    }
    
    /*  Récupérer un client par ID
    @GetMapping("/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable Long id) {
        //return clientService.getClientById(id)
               // .map(ResponseEntity::ok)
              //  .orElse(ResponseEntity.notFound().build());
    } */
    
    // Créer un nouveau client
    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        Client nouveauClient = clientService.creerClient(client);
        return ResponseEntity.status(HttpStatus.CREATED).body(nouveauClient);
    }
    
    // Mettre à jour un client
    @PutMapping("/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable Long id, @RequestBody Client client) {
        try {
            Client clientMisAJour = clientService.updateClient(id, client);
            return ResponseEntity.ok(clientMisAJour);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
    
    // Supprimer un client
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
        return ResponseEntity.noContent().build();
    }
    
    // Rechercher des clients par nom
 //   @GetMapping("/recherche")
   // public ResponseEntity<List<Client>> rechercherClients(@RequestParam String nom) {
      //  List<Client> clients = clientService.getClientById(nom);
        //return ResponseEntity.ok(clients); }
}