package PracticaNum3ejer4;

public class Episodio extends Temporada {
	
	private String titulo;
	private String descripcion;
	
	private int calificacion;
	private boolean visto;
	
	
	public Episodio(String titulo, String descripcion, int calificacion, boolean visto) {
		this.setTitulo(titulo);
		this.setDescripcion(descripcion);
		this.setCalificacion(calificacion);
		this.visto = visto;
	}
	
	public Episodio(String titulo, String descripcion) {
		this.setTitulo(titulo);
		this.setDescripcion(descripcion);
		this.visto = false;
	}
	
	//Ingresar la calificación de un episodio. Si el valor ingresado como calificación no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior.
	public void setCalificacion(int calificacion) {
		int valorMax = 5;
		int valorMin = 1;
		if(calificacion >= valorMin && calificacion <= valorMax) {
			this.calificacion = calificacion;
		}
		else {
			System.out.println("ERROR EN LA CALIFICACION");
			this.calificacion = 0;
		}
	}
	
	public int getCalificacion() {
		return calificacion;
	}

	public boolean getVisto() {
		return visto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
