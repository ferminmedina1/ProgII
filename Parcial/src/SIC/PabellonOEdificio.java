package SIC;

import java.util.ArrayList;

//Este nombre para la clase lo quise cambiar pero me dio un error asi que lo deje como estaba.
//Seria mejor ponerle ContenedorDeEstacionamiento o algo asi, ya que tanto los diferentes niveles como los edificios/pabellones tienen la misma funcionalidad.
public class PabellonOEdificio extends ElementoSIC{

	private ArrayList<ElementoSIC> subContenedor;
	
	public PabellonOEdificio() {
		subContenedor = new ArrayList<>();
	}
	
	public void agregarSubContenedor(ElementoSIC p) {
		subContenedor.add(p);
	}


	@Override
	public int totalCocheras() {
		int contador = 0;
		
		for (ElementoSIC e : subContenedor) {
			contador += e.totalCocheras();
		}
		return contador;
	}

	@Override
	public ArrayList<Cochera> getCocherasDisponibles(Automovil auto) {
		ArrayList<Cochera> cumple = new ArrayList<>();
		for (ElementoSIC contenedor : subContenedor) {			
			cumple.addAll(contenedor.getCocherasDisponibles(auto));
		}
		return cumple;
	}

	@Override
	public ElementoSIC getCopia(Filtro f) {
		PabellonOEdificio copia = new PabellonOEdificio();
		for (ElementoSIC elem : subContenedor) {
			ElementoSIC copiaHijo = elem.getCopia(f);
			if(copiaHijo != null) {
				copia.agregarSubContenedor(copiaHijo);
			}
		}
		if(copia.tieneElementos()) {
			return copia;			
		}
		return null;
	}

	private boolean tieneElementos() {
		return this.subContenedor.size() > 0;
	}
	
}
