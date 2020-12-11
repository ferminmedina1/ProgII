package PracticaNum3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Persona {

	private String nombre = "N";
	private String apellido = "N";

	private String sexo = "femenino";
	private int edad;

	//fecha de nacimiento
	private int diaNacimiento = 1;
	private int mesNacimiento = 1;
	private int anioNacimiento = 2001;
	//
	
	private int dni;
	
	private double peso = 1;
	private double altura = 1;
	
	private double masa;
	private boolean enForma,cumpleaneos,mayorEdad,poderVotar,coherenciaEdad;
	
	Calendar cal = Calendar.getInstance(); 
	

	public Persona(int dni2, String nombre2, String apellido2,String sexo2, int edad2, int diaNacimiento2, int mesNacimiento2, int anioNacimiento2, double peso2, double altura2) {
		
		nombre = nombre2;
		
		dni = dni2;
		
		apellido = apellido2;
		
		sexo = sexo2;
		
		edad = edad2;
		
		diaNacimiento = diaNacimiento2;
		
		mesNacimiento = mesNacimiento2;
		
		anioNacimiento = anioNacimiento2;
		
		peso = peso2;
		
		altura = altura2;
		
		masa = MasaCorporal();
		
		enForma = Forma();
		
		cumpleaneos = Cumpleaneos();
		
		mayorEdad = Legalidad();
		
		poderVotar = PosibilidadVotar();
		
		coherenciaEdad = CoherenciaEdad();
		

	}
	
	
	
	//Gets pai

	private double MasaCorporal() {
		
		double masa;
		
		masa = this.peso / (this.altura * this.altura);
		
		return masa;
		
	}
	
	private boolean Forma() {
		double MINEnForma = 18.5;
		double MAXEnForma = 25;
		
		if(this.masa >= MINEnForma && this.masa <= MAXEnForma) {
			return true;
		}else {
			return false;
		}
		
	}
	
	private boolean Cumpleaneos() {

		int diaHoy = cal.get(Calendar.DAY_OF_MONTH);
		int mesHoy = cal.get(Calendar.MONTH);
		mesHoy += 1;
		if(this.diaNacimiento == diaHoy && this.mesNacimiento == mesHoy) {
			return true;
		}else {
			return false;
		}
		
	}
	
	private boolean CoherenciaEdad() {
		
		int diaHoy = cal.get(Calendar.DAY_OF_MONTH);
		int mesHoy = cal.get(Calendar.MONTH);
		mesHoy += 1;
		int anioHoy = cal.get(Calendar.YEAR);
		
		int edadConFecha = anioHoy - this.anioNacimiento;
		
		if(mesHoy < this.mesNacimiento) {
			edadConFecha--;
		} else if(mesHoy == this.mesNacimiento) {
			if(diaHoy < this.diaNacimiento) {
				edadConFecha--;
			}
		}
		
		if(this.edad == edadConFecha) {
			return true;
		}else {
			return false;
		}
		
	}
	
	private boolean Legalidad() {
		double edadLegal = 18;
		if(this.edad >= edadLegal) {
			return true;
		}else {
			return false;
		}
		
	}
	
	private boolean PosibilidadVotar() {
		double edadParaVotar = 16;
		if(this.edad >= edadParaVotar) {
			return true;
		}else {
			return false;
		}
		
	}



	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public int getDiaNacimiento() {
		return diaNacimiento;
	}



	public void setDiaNacimiento(int diaNacimiento) {
		this.diaNacimiento = diaNacimiento;
	}



	public int getMesNacimiento() {
		return mesNacimiento;
	}



	public void setMesNacimiento(int mesNacimiento) {
		this.mesNacimiento = mesNacimiento;
	}



	public int getAnioNacimiento() {
		return anioNacimiento;
	}



	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}



	public int getDni() {
		return dni;
	}



	public void setDni(int dni) {
		this.dni = dni;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public double getMasa() {
		return masa;
	}



	public void setMasa(double masa) {
		this.masa = masa;
	}



	public boolean isEnForma() {
		return enForma;
	}



	public void setEnForma(boolean enForma) {
		this.enForma = enForma;
	}



	public boolean isCumpleaneos() {
		return cumpleaneos;
	}



	public void setCumpleaneos(boolean cumpleaneos) {
		this.cumpleaneos = cumpleaneos;
	}



	public boolean isMayorEdad() {
		return mayorEdad;
	}



	public void setMayorEdad(boolean mayorEdad) {
		this.mayorEdad = mayorEdad;
	}



	public boolean isPoderVotar() {
		return poderVotar;
	}



	public void setPoderVotar(boolean poderVotar) {
		this.poderVotar = poderVotar;
	}



	public boolean isCoherenciaEdad() {
		return coherenciaEdad;
	}



	public void setCoherenciaEdad(boolean coherenciaEdad) {
		this.coherenciaEdad = coherenciaEdad;
	}


	
	
	
	
	//Sets
	

	

}
