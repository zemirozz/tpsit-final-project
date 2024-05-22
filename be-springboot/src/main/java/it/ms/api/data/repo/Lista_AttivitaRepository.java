package it.ms.api.data.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import it.ms.api.data.entity.Lista_Attivita;

public interface Lista_AttivitaRepository extends JpaRepository<Lista_Attivita, Long> {

  Lista_Attivita findById(int id);
  

  
}