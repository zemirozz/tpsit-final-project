package it.ms.api.data.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import it.ms.api.data.entity.Tipo_Luogo;


public interface Tipo_LuogoRepository extends JpaRepository<Tipo_Luogo, Long> {

  Tipo_Luogo findById(int id );
  
}