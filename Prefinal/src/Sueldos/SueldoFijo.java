package Sueldos;

import Empresa.Programador;

public class SueldoFijo implements Sueldo {

	private int pago;
	
	public SueldoFijo(int pago) {
		super();
		this.pago = pago;
	}

	@Override
	public int calcularSueldo(Programador p) {
		// TODO Auto-generated method stub
		return pago + p.getPrecioHorasTrabajoExtra();
	}

}
