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

import edu.unimagdalena.Domicilio.model.Domicilios;
import edu.unimagdalena.Domicilio.services.InterDomicilio;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:8080","http://localhost:3000"})
public class DomiciliosController {

@Autowired
private InterDomicilio dService;

@PostMapping("/Domicilios/crear")
public Domicilios crear(@RequestBody Domicilios pro) {
return dService.crearD(pro);
}

@PutMapping("/Domicilios/actualizar/{id}")
public Domicilios update(@RequestBody Domicilios ds, @PathVariable("id") Long id) {
	Domicilios oldD = dService.buscarD_Id(id);
	String nombreS = ds.getNombreS();
	oldD.setNombreS(nombreS);
	String estado = ds.getEstado();
	oldD.setEstado(estado);
	String horaS = ds.getHoraS();
	oldD.setHoraS(horaS);
	String nombreD = ds.getNombreD();
	oldD.setNombreD(nombreD);
	String direccionD = ds.getDireccionD();
	oldD.setDireccionD(direccionD);
	String direccionS = ds.getDireccionS();
	oldD.setDireccionS(direccionS);
	String celularS = ds.getCelularS();
	oldD.setCelularS(celularS);
	String celularD = ds.getCelularD();
	oldD.setCelularD(celularD);
	String descripcionPaquete = ds.getDescripcionPaquete();
	oldD.setDescripcionPaquete(descripcionPaquete);
	
	return dService.actualizarD(oldD);
}

@DeleteMapping("/Domicilios/borrar/{id}")
public void borrar(@PathVariable("id") Long id) {
	Domicilios d = dService.buscarD_Id(id);
	dService.eliminarD(d);
}

@DeleteMapping("/Domicilios/borrarTodo")
public void borrarTodo() {
dService.EliminarTodos();
}

@GetMapping("/Domicilios/listar")
public List<Domicilios> listar(){
return dService.buscar_Ds();
}
}