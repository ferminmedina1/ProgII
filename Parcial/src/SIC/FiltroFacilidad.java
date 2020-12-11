package SIC;

public class FiltroFacilidad implements Filtro {

	private String facilidad;
	
	public FiltroFacilidad(String f) {
		facilidad = f.toUpperCase();
	}

	@Override
	public boolean cumple(Automovil c) {
		return c.tieneFacilidad(facilidad);
	}
	
}
