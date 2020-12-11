package PracticaNum3ejer3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PuntoGeometrico punto = new PuntoGeometrico(3,8);
		PuntoGeometrico punto2 = new PuntoGeometrico(0,0);
		System.out.println("La coordenada X del punto es: " + punto.getX() + ". Y la coordenada Y es: " + punto.getY() + ".");
		System.out.println("La coordenada X del segundo punto es: " + punto2.getX() + ". Y la coordenada Y es: " + punto2.getY() + ".");
		System.out.println("La distacnia euclidia es de : " + punto.distanciaEuclidea(punto2));
		
		Rectangulo rec = new Rectangulo(punto,punto2);
	}

}
