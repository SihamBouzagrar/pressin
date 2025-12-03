package com.sihamcode.pressin.services;
import com.sihamcode.pressin.entities.Client;
import com.sihamcode.pressin.repositories.ClientRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ClientService {
  @Autowired
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
 // Créer un client
    public Client creerClient(Client client) {
        return clientRepository.save(client);
    }
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client getClientById(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client introuvable"));
    }

    public Client updateClient(Long id, Client clientDetails) {
        Client c = getClientById(id);
        c.setNom(clientDetails.getNom());
       
        c.setTelephone(clientDetails.getTelephone());
        return clientRepository.save(c);
    }
    

    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
    public void operations() {
        
        // TROUVER tous
        List<Client> tous = clientRepository.findAll();
        
        // SAUVEGARDER (créer ou modifier)
        Client nouveau = new Client("Ali", "0612345678");
        clientRepository.save(nouveau);
        
        // SUPPRIMER par ID
        clientRepository.deleteById(1L);
        
        // VÉRIFIER si existe
        boolean existe = clientRepository.existsById(1L);
        
        // COMPTER
        long total = clientRepository.count();
    }
}


    
  
    
    
    
    
    
  

