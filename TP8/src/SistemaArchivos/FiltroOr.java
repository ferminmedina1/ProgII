package SistemaArchivos;

public class FiltroOr implements Filtro{

	private Filtro f1;
	private Filtro f2;
	
	public FiltroOr(Filtro f1, Filtro f2) {
		// TODO Auto-generated constructor stub
		this.f1 = f1;
		this.f2 = f2;
	}
	
	@Override
	public boolean cumple(ElementoSA elem) {
		// TODO Auto-generated method stub
		return f1.cumple(elem) || f2.cumple(elem);
	}
}
