package PracticaNum4ejer1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlarmaLuminosa alarma = new AlarmaLuminosa(true,true,false);
		Sensor sensor1 = new Sensor("living", true);
		alarma.Comprobar(sensor1);
	}

}
