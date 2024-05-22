package it.ms.api.data.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import it.ms.api.data.entity.Luogo;


public interface LuogoRepository extends JpaRepository<Luogo, Long> {

  Luogo findById(int id);
  
}