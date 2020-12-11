package PracticaNum4ejer4;

public class Masajista extends Integrante {

	private String titulo;
	private int experiencia;
	
	public Masajista(String nombre, String apellido, int pasaporte, int diaNacimiento, int mesNacimiento,
			int anioNacimiento, String titulo, int experiencia) {
		super(nombre, apellido, pasaporte, diaNacimiento, mesNacimiento, anioNacimiento);
		// TODO Auto-generated constructor stub
		this.titulo = titulo;
		this.experiencia = experiencia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	
}
