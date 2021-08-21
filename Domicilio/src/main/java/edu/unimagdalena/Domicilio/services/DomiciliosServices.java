package edu.unimagdalena.Domicilio.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import edu.unimagdalena.Domicilio.model.Domicilios;
import edu.unimagdalena.Domicilio.repository.DomicilioRepository;
import edu.unimagdalena.Domicilio.services.InterDomicilio;

@Service
public class DomiciliosServices implements InterDomicilio{

@Autowired
private DomicilioRepository Doms;

@Override
public Domicilios crearD(Domicilios ds) {
return Doms.save(ds);
}

@Override
public Domicilios actualizarD(Domicilios ds) {
return Doms.save(ds);
}

@Override
public void eliminarD(Domicilios ds) {
Doms.delete(ds);

}

@Override
public List<Domicilios> buscar_Ds() {
return Doms.findAll();
}

@Override
public Domicilios buscarD_Id(Long id) {
return Doms.getOne(id);
}

@Override
public void EliminarTodos() {
Doms.deleteAll();
}
}