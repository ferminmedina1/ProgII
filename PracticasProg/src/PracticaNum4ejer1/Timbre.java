package PracticaNum4ejer1;

public class Timbre extends AlarmaLuminosa {
	
	public Timbre() {
		
	}
	
	public Timbre(boolean seguridad) {
		if(!seguridad) {
			hacerSonar();
		}else {
			System.out.println("El timbre no sono.");
		}
	}
	
	public void hacerSonar() {
		System.out.println("UIUIUUI");
	}
}
