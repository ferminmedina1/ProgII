package SistemaArchivos;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementoSA {
	
	private String nombre;
	private LocalDate fechaCreacion, fechaModificacion;
	
	public ElementoSA(String nombre) {
		this.nombre = nombre;
		this.fechaCreacion = LocalDate.now();
		this.fechaModificacion = LocalDate.now();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion() {
		this.fechaModificacion = LocalDate.now();
	}
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	
	public abstract double getTamanio();
	public abstract ArrayList<ElementoSA> buscar(Filtro f);
	
}
