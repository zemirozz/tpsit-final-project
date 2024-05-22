package it.ms.api.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.ms.api.data.entity.Citta;


public interface CittaRepository extends JpaRepository<Citta, Long> {

  List<Citta> findByNome(String Nome);
  
  Citta findByCAP(int CAP);

}
