package edu.unimagdalena.Domicilio.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.unimagdalena.Domicilio.model.Domicilios;

@Repository
public interface DomicilioRepository extends JpaRepository <Domicilios,Long> {

}