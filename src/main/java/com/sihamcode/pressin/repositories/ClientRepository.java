
package com.sihamcode.pressin.repositories;
import com.sihamcode.pressin.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<Client, Long> {
}
