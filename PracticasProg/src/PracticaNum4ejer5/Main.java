package PracticaNum4ejer5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductoRefrigerado carne = new ProductoRefrigerado(LocalDate.of(2020, 12, 03), 1,LocalDate.of(2019, 12, 03), "La Estrella", 12, -10);
		
		ProductoFresco tomate = new ProductoFresco(LocalDate.of(2020, 12, 03), 2,LocalDate.of(2019, 12, 03), "La Estrellita");
		
		ProductoCongelado brocoliCongelado = new CongeladoPorAgua(LocalDate.of(2020, 12, 03), 3,LocalDate.of(2019, 12, 03), "La Estrellota",3,-10,5,2);
		ProductoCongelado tomateCongelado = new CongeladoPorNitrogeno(LocalDate.of(2020, 12, 03), 4,LocalDate.of(2019, 12, 03), "La Estrell4",3,-10,13);
		ProductoCongelado lechugaCongelada = new CongeladoPorAire(LocalDate.of(2020, 12, 03), 5,LocalDate.of(2019, 12, 03), "La Estrelloide",3,-10,30,20,20,30);
		
		ArrayList<Producto> productos = new ArrayList<Producto>();
		
		productos.add(carne);
		productos.add(tomate);
		productos.add(brocoliCongelado);
		productos.add(tomateCongelado);
		productos.add(lechugaCongelada);
		
		//System.out.println(carne.getEnvasado());
		//System.out.println(tomate.getGranjaOrigen());
//		for (int j = 0; j < productos.size(); j++) {
//			System.out.println(productos.get(j).getAtributos());
//		}
		String EtiquetaBrocoli = brocoliCongelado.toString();
		
		System.out.println(EtiquetaBrocoli);
	}

}
