package SIC;

import java.util.ArrayList;

public class Cochera extends ElementoSIC{

	private Automovil auto;
	private ArrayList<String> facilidades;
	private Filtro filtroCochera;
	
	public Cochera() {
		facilidades = new ArrayList<>();
	}
	
	public Cochera(Filtro filtroCochera) {
		facilidades = new ArrayList<>();
		this.filtroCochera = filtroCochera;
	}
	
	public void setAuto(Automovil a) {
		if(!this.isOcupado()) {
		auto = a;
		}
	}
	
	public void agregarFacilidad(String f) {
		facilidades.add(f);
	}
	
	public void agregarFiltro(Filtro f) {
		filtroCochera = f;
	}
	
	public boolean isOcupado() {
		return auto != null;
	}

	public int totalCocheras() {
		return 1;
	}

	@Override
	public ArrayList<Cochera> getCocherasDisponibles(Automovil auto) {
		ArrayList<Cochera> cumple = new ArrayList<>();
		if(!this.isOcupado() && filtroCochera.cumple(auto)) {
			cumple.add(this);
		}
		return cumple;
	}

	@Override
	public ElementoSIC getCopia(Filtro f) {
		if(this.isOcupado() && f.cumple(this.auto)) {
			Cochera copia = new Cochera(this.filtroCochera);
			copia.setAuto(this.auto.getCopia());
			
			for (String string : facilidades) {
				copia.agregarFacilidad(string);
			}
			return copia;
		}
		
		return null;
	}


}

