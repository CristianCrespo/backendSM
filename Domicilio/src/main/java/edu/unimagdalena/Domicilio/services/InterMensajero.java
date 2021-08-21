package edu.unimagdalena.Domicilio.services;

import java.util.List;

import edu.unimagdalena.Domicilio.model.Mensajeros;

public interface InterMensajero {
	Mensajeros crearM(Mensajeros mens);
	Mensajeros actualizarM(Mensajeros mens);
	Mensajeros buscarM_Id(Long id);
	List<Mensajeros> buscar_Ms();
	void eliminarM(Mensajeros mens);
	void EliminarTodos();
}