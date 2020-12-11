package SIC;

public class FiltroModelo implements Filtro{

	private int modelo;
	
	public FiltroModelo(int m) {
		modelo = m;
	}
	
	@Override
	public boolean cumple(Automovil c) {
		return c.getModelo() < modelo;
	}
}
