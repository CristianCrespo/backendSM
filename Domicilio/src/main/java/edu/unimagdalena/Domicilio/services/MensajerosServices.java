package edu.unimagdalena.Domicilio.services;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import edu.unimagdalena.Domicilio.model.Mensajeros;
import edu.unimagdalena.Domicilio.repository.MensajeroRepository;
import edu.unimagdalena.Domicilio.services.InterMensajero;

@Service
public class MensajerosServices implements InterMensajero{

@Autowired
private MensajeroRepository mens;

@Override
public Mensajeros crearM(Mensajeros ms) {
return mens.save(ms);
}

@Override
public Mensajeros actualizarM(Mensajeros ms) {
return mens.save(ms);
}

@Override
public void eliminarM(Mensajeros ms) {
mens.delete(ms);

}

@Override
public List<Mensajeros> buscar_Ms() {
	return mens.findAll();
}

@Override
public Mensajeros buscarM_Id(Long id) {
	return mens.getOne(id);
}

@Override
public void EliminarTodos() {
mens.deleteAll();
}
}