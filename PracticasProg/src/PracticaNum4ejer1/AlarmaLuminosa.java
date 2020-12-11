package PracticaNum4ejer1;

public class AlarmaLuminosa {

	private boolean rompioVidrio;
	private boolean abrioEntrada;
	private boolean movimiento;
	private boolean seguridad;
	public AlarmaLuminosa() {
		
	}
	
	public AlarmaLuminosa(boolean rompiovid,boolean abrioEntrada,boolean movimiento) {
		this.rompioVidrio = rompiovid;
		this.abrioEntrada = abrioEntrada;
		this.movimiento = movimiento;
		
	}
	
	public void Comprobar(Sensor sensor) {

		//if(!rompioVidrio) == if (rompioVidrio == false) 
		if(!rompioVidrio) {
			sensor.ActualizarAlarma(rompioVidrio);
			this.seguridad = false;
		}
		if(!abrioEntrada) {
			sensor.ActualizarAlarma(abrioEntrada);
			this.seguridad = false;
		}
		if(!movimiento) {
			sensor.ActualizarAlarma(movimiento);
			this.seguridad = false;
		}
		if(rompioVidrio == true && abrioEntrada == true && movimiento == true) {
			System.out.println("La casa esta segura!");
			this.seguridad = true;
		}
	}
	
	public void Comprobar(String zona) {

		//if(!rompioVidrio) == if (rompioVidrio == false) 
		if(!rompioVidrio) {
			System.out.println("Rompieron el vidrio!");
			System.out.println("Cuidado el sensor deteco una rotura en: " + zona);
			seguridad = false;
		}
		if(!abrioEntrada) {
			System.out.println("Abrieron una entrada");
			System.out.println("Cuidado el sensor deteco que se abrio una entrada en: " + zona);
			seguridad = false;
		}
		if(!movimiento) {
			System.out.println("Hubo movimiento");
			System.out.println("Cuidado el sensor deteco movimiento en: " + zona);
			seguridad = false;
		}
		if(rompioVidrio == true && abrioEntrada == true && movimiento == true) {
			System.out.println("La casa esta segura!");
			seguridad = true;
		}

		new Timbre(seguridad);
		new Luz(seguridad);
	}
}
