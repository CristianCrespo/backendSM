package edu.unimagdalena.Domicilio.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unimagdalena.Domicilio.model.Mensajeros;
import edu.unimagdalena.Domicilio.services.InterMensajero;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:8080","http://localhost:3000"})
//@CrossOrigin(origins = "*")
public class MensajerosController {

@Autowired
private InterMensajero mService;

@PostMapping("/Mensajeros/crear")
public Mensajeros crear(@RequestBody Mensajeros pro) {
return mService.crearM(pro);
}
//aqui ustedes esperan localhot:8080/Mensajeros/actualizar/5
//y estan enviando localhost:8080/Mensajeros/actualizar5
//ven la diferenencia?Request URL: http://localhost:8080/api/Mensajeros/actualizar/5
@PutMapping("/Mensajeros/actualizar/{id}")
public Mensajeros update(@RequestBody Mensajeros ms, @PathVariable("id") Long id) {
	Mensajeros oldM = mService.buscarM_Id(id);
	String nombreM = ms.getNombreM();
	oldM.setNombreM(nombreM);
	String cedulaM = ms.getCedulaM();
	oldM.setCedulaM(cedulaM);
	String celularM = ms.getCelularM();
	oldM.setCelularM(celularM);
	String placa = ms.getPlaca();
	oldM.setPlaca(placa);
	String direccionM = ms.getDireccionM();
	oldM.setDireccionM(direccionM);
	return mService.actualizarM(oldM);
}
@GetMapping("/Mensajeros/{id}")
public void buscarM_Id(@PathVariable("id")Long id) {
	Mensajeros m = mService.buscarM_Id(id);
	mService.buscarM_Id(id);
}


@DeleteMapping("/Mensajeros/borrar/{id}")
public void borrar(@PathVariable("id") Long id) {
	Mensajeros m = mService.buscarM_Id(id);
	mService.eliminarM(m);
}

@DeleteMapping("/Mensajeros/borrarTodo")
public void borrarTodo() {
	mService.EliminarTodos();
}

@GetMapping("/Mensajeros/listar")
public List<Mensajeros> listar(){
	return mService.buscar_Ms();
}
}