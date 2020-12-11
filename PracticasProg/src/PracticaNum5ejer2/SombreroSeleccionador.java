package PracticaNum5ejer2;

import java.util.ArrayList;

public class SombreroSeleccionador {
	
	private Alumno alumno;
	
	private ArrayList<Casa> casas = new ArrayList<Casa>();
	
	public SombreroSeleccionador() {
	}

	public void pushCasa(Casa casa) {
		casas.add(casa);
		System.out.println("Se agrego una casa al sombrero: '" + casa);
		System.out.println("******************************");
	}
	
	public ArrayList<Casa> getCasas() {
		return casas;
	}

	
	public void encontrarCasa(Alumno alumno) {
		this.alumno = alumno;
		for(Casa casa : casas) {
			boolean lugar = casa.hayLugar();
			boolean coincidenCualidades = getCoicidencia(alumno,casa);
			boolean sangreFamiliar = getSangrePura(alumno,casa);
			//boolean enemistad = getTraidor()

			if(lugar && coincidenCualidades && sangreFamiliar) {
				System.out.println("El alumno: " + alumno + ". Es aceptado en la casa: " + casa);
			}else {
				System.out.println(alumno + " no fue aceptado en: " + casa);
			}
		}
		System.out.println("-----------------------------");
	}
	
	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	public boolean getCoicidencia(Alumno alumno, Casa casa) {
		if(alumno.getCualidades().equals(casa.getCualidades())) {
			return true;			
		}else{
			return false;
		}
	}
	
	public boolean getSangrePura(Alumno alumno, Casa casa) {
		ArrayList<Alumno> familiares = alumno.getFamiliares();
		
		if(familiares != null) {
			for(Alumno familiar: familiares) {
				if(familiar.getPerteneceACasa() == null) {
					return false;
				}
				if(familiar.getPerteneceACasa().equals(casa)) {
					return true;
				}else {
					return false;
				}
			}
		}
		return false;
	}

	public boolean getTraidor(Alumno alumno, Casa casa) {
		
		return false;
	}

}
