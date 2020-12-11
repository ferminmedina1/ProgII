package Sueldos;

import Empresa.Programador;

public class SueldoPorHora implements Sueldo {

	private int pagoPorHora;
	
	public SueldoPorHora(int pagoPorHora) {
		super();
		this.pagoPorHora = pagoPorHora;
	}

	@Override
	public int calcularSueldo(Programador p) {
		// TODO Auto-generated method stub
		return pagoPorHora * p.getHorasDeTrabajo() + p.getPrecioHorasTrabajoExtra();
	}
}
