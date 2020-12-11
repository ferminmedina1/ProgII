package SistemaArchivos;

import java.time.LocalDate;

public class FiltroModificacion implements Filtro{

	private LocalDate fecha;
	
	public FiltroModificacion(LocalDate fecha) {
		// TODO Auto-generated constructor stub
		this.fecha = fecha;
	}
	
	@Override
	public boolean cumple(ElementoSA elem) {
		// TODO Auto-generated method stub
		return elem.getFechaModificacion().isAfter(fecha);
	}

	
	
}
