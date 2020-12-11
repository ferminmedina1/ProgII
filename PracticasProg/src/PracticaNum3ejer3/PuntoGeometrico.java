package PracticaNum3ejer3;

public class PuntoGeometrico {

	private double x;
	private double y;
	
	private double distancia;
	
	public PuntoGeometrico(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public PuntoGeometrico() {
		this.x = 0;
		this.y = 0;
	}
	
	public void desplazarPunto(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double distanciaEuclidea(PuntoGeometrico p) {
        double diferenciaX = x - p.getX();
        double diferenciaY = y - p.getY();
		
        return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	
}
 