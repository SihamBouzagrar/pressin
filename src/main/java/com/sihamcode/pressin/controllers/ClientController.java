
package com.sihamcode.pressin.controllers;
import com.sihamcode.pressin.entities.Client;
import com.sihamcode.pressin.repositories.ClientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    // Lister tous les clients
    @GetMapping
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    // Ajouter un client
    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientRepository.save(client);
    }
}
