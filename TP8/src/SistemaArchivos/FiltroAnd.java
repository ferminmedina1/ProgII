package SistemaArchivos;

public class FiltroAnd implements Filtro {
	
	private Filtro f1;
	private Filtro f2;
	
	public FiltroAnd(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public boolean cumple(ElementoSA elem) {
		return f1.cumple(elem) && f2.cumple(elem);
	}

}
