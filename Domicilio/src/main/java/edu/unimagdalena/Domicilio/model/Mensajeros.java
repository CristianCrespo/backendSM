package edu.unimagdalena.Domicilio.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="mensajeros")

public class Mensajeros {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column
private String nombreM;
@Column
private String cedulaM;
@Column
private String celularM;
@Column
private String placa;
@Column
private String direccionM;


@JsonIgnore
@OneToMany(mappedBy = "mensajero", cascade = CascadeType.ALL, orphanRemoval = true)
private List<Domicilios> Domicilios;

public Mensajeros() {
super();
// TODO Auto-generated constructor stub
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getNombreM() {
	return nombreM;
}

public void setNombreM(String nombreM) {
	this.nombreM = nombreM;
}

public String getCedulaM() {
	return cedulaM;
}

public void setCedulaM(String cedulaM) {
	this.cedulaM = cedulaM;
}

public String getCelularM() {
	return celularM;
}

public void setCelularM(String celularM) {
	this.celularM = celularM;
}

public String getPlaca() {
	return placa;
}

public void setPlaca(String placa) {
	this.placa = placa;
}

public String getDireccionM() {
	return direccionM;
}

public void setDireccionM(String direccionM) {
	this.direccionM = direccionM;
}

public List<Domicilios> getDomicilios() {
	return Domicilios;
}

public void setDomicilios(List<Domicilios> domicilios) {
	Domicilios = domicilios;
}



}