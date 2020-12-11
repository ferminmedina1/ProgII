package SIC;

import java.util.ArrayList;

public abstract class ElementoSIC {
	
	public abstract int totalCocheras();
	
	public abstract ArrayList<Cochera> getCocherasDisponibles(Automovil auto);
	
	public abstract ElementoSIC getCopia(Filtro f);

}
