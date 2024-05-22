package it.ms.api.data.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import it.ms.api.data.entity.Utente;


public interface UtenteRepository extends JpaRepository<Utente, Long> {

  Utente findById(int Id);
  
}