package edu.unimagdalena.Domicilio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="domicilios")
public class Domicilios {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column
private String nombreS;//
@Column
private String direccionS;//
@Column
private String celularS;//
@Column
private String horaS;//
@Column
private String nombreD;//
@Column
private String direccionD;//
@Column 
private String celularD;//
@Column
private String descripcionPaquete;//
@Column
private String estado;//



@ManyToOne
@JoinColumn(name="idmensajero")
private Mensajeros mensajero;

public Domicilios() {
super();
// TODO Auto-generated constructor stub
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getNombreS() {
	return nombreS;
}

public void setNombreS(String nombreS) {
	this.nombreS = nombreS;
}

public String getDireccionS() {
	return direccionS;
}

public void setDireccionS(String direccionS) {
	this.direccionS = direccionS;
}

public String getCelularS() {
	return celularS;
}

public void setCelularS(String celularS) {
	this.celularS = celularS;
}

public String getHoraS() {
	return horaS;
}

public void setHoraS(String horaS) {
	this.horaS = horaS;
}

public String getNombreD() {
	return nombreD;
}

public void setNombreD(String nombreD) {
	this.nombreD = nombreD;
}

public String getDireccionD() {
	return direccionD;
}

public void setDireccionD(String direccionD) {
	this.direccionD = direccionD;
}

public String getCelularD() {
	return celularD;
}

public void setCelularD(String celularD) {
	this.celularD = celularD;
}

public String getDescripcionPaquete() {
	return descripcionPaquete;
}

public void setDescripcionPaquete(String descripcionPaquete) {
	this.descripcionPaquete = descripcionPaquete;
}

public String getEstado() {
	return estado;
}

public void setEstado(String estado) {
	this.estado = estado;
}

public Mensajeros getMensajero() {
	return mensajero;
}

public void setMensajero(Mensajeros mensajero) {
	this.mensajero = mensajero;
}

}