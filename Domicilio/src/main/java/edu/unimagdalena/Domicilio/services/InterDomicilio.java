package edu.unimagdalena.Domicilio.services;

import java.util.List;

import edu.unimagdalena.Domicilio.model.Domicilios;

public interface InterDomicilio {
	Domicilios crearD(Domicilios Doms);
	Domicilios actualizarD(Domicilios Doms);
	Domicilios buscarD_Id(Long id);
	List<Domicilios> buscar_Ds();
	void eliminarD(Domicilios Doms);
	void EliminarTodos();
}