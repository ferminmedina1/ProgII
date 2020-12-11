package PracticaNum4ejer1;

public class Sensor extends AlarmaLuminosa{

	private String parteCasa;
	private boolean movimiento;
	
	public Sensor(String parteCasa,boolean movimiento) {
		this.parteCasa = parteCasa;
		this.setMovimiento(movimiento);
	}
	
	public void ActualizarAlarma(boolean movimiento) {
		if(!movimiento) {
			super.Comprobar(this.parteCasa);
		}
	}

	public boolean isMovimiento() {
		return movimiento;
	}

	public void setMovimiento(boolean movimiento) {
		this.movimiento = movimiento;
	}
}
