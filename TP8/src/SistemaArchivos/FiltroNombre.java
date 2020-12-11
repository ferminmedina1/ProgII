package SistemaArchivos;

public class FiltroNombre implements Filtro{

	private String nombre;
	
	public FiltroNombre(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
	}
	
	@Override
	public boolean cumple(ElementoSA elem) {
		// TODO Auto-generated method stub
		return elem.getNombre().contains(nombre);
	}

}
