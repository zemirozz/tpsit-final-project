package it.ms.api.data.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import it.ms.api.data.entity.Prenotazione;


public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {

  
}