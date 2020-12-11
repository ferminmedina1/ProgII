package PracticaNum4ejer1;

public class Luz extends AlarmaLuminosa {

	
	public Luz(boolean seguridad) {
		if(!seguridad) {
			Encender();
		}else {
			System.out.println("La luz no se encendio.");
		}
	}

	public void Encender() {
		System.out.println("La luz esta prendida!");
	}
}
