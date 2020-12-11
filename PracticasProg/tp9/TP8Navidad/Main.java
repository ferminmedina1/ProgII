package TP8Navidad;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ninio ninioBueno = new Ninio(1);
		Ninio ninioMalo = new Ninio(2);
		
		Carta cartaBuena = new Carta(ninioBueno);
		cartaBuena.addRegalo("Bicicleta");
		cartaBuena.addRegalo("Arco");
		
		Carta cartaMala = new Carta(ninioMalo);
		cartaMala.addRegalo("pistola");
		cartaMala.addRegalo("droga");
		
		Buzon buzon1 = new Buzon();
		buzon1.addNinioBueno(1);
		
		System.out.println(cartaMala.getRegalos());
		buzon1.addCarta(cartaBuena);
		buzon1.addCarta(cartaMala);
		buzon1.addCarta(cartaBuena);
		System.out.println(cartaMala.getRegalos());
		
		ContenedorBuzon arg = new ContenedorBuzon("Argentina");
		arg.addElem(buzon1);
		
		System.out.println(arg.getCartasTotales());
		
		Condicion c1 = new CondicionRegalo("arco");
		
		System.out.println(arg.getCartasCumplidoras(c1));
	}

}
