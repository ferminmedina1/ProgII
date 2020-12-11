package PrimerPrograma;

import java.util.HashMap;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
	
		HashMap<String, Integer> mapa = new HashMap<>();
		
		mapa.put("fuerza", 14);
		mapa.put("velocidad", 40);
		mapa.put("peso", 4);
		mapa.put("habilidad", 62);
		
		if(mapa.containsValue(14))
			System.out.println("hay una hablidad de 14");
		
		if(mapa.containsValue(null))
			System.out.println("hay una hablidad nula");
		
		if(mapa.containsKey("peso"))
			System.out.println("esta la hablidad peso");
		
		Iterator<String> iterator = mapa.keySet().iterator();
		
		while (iterator.hasNext()) {
			String string = iterator.next();
			
			System.out.println(string + " valor: " + mapa.get(string));
			
		}
		
		//Juego juegoNuevo = new Juego("morron", "Nano",6);
		
		
		//juegoNuevo.jugar();
	}
}
