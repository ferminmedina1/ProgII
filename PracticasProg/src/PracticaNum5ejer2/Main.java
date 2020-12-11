package PracticaNum5ejer2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno gustavoMedina = new Alumno("Fermin","Volar","Leer Mentes", "Comer");
		Alumno cristinaRoteno = new Alumno("Fermin","Volar","Leer Mentes", "Comer");
		
		Alumno ferminMedina = new Alumno("Fermin","Volar","Leer Mentes", "Comer");
		Alumno luciaLapena = new Alumno("Lucia","Volar","Dormir", "Ser invisible");
		Alumno daddyYankee = new Alumno("Daddy","Cantar","Bailar", "Sacar temones");
		
		ArrayList<String> cualidadhuff = new ArrayList<String>();
		cualidadhuff.add("Volar");
		cualidadhuff.add("Leer Mentes");
		cualidadhuff.add("Comer");
		
		Casa Hufflepuff = new Hufflepuff("Hufflepuff",130,cualidadhuff);
		
		
		SombreroSeleccionador sombrero = new SombreroSeleccionador();
		sombrero.pushCasa(Hufflepuff);
		
		sombrero.encontrarCasa(ferminMedina);
				

		
		
		
	}

}
