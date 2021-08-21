package edu.unimagdalena.Domicilio.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.unimagdalena.Domicilio.model.Mensajeros;

@Repository
public interface MensajeroRepository extends JpaRepository <Mensajeros,Long> {

}