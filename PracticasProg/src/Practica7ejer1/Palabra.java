package Practica7ejer1;

import java.util.ArrayList;

public class Palabra {
	
	private String funcionGramatical;
	private ArrayList<String>definiciones;
	private ArrayList<String>sinonimos;
	private ArrayList<String>antominos;
	
	public Palabra(){
		
	}

	public String getFuncionGramatical() {
		return funcionGramatical;
	}

	public void setFuncionGramatical(String funcionGramatical) {
		this.funcionGramatical = funcionGramatical;
	}

	public ArrayList<String> getDefiniciones() {
		return (ArrayList<String>) definiciones.clone();
	}

	public ArrayList<String> getSinonimos() {
		return sinonimos;
	}

	public ArrayList<String> getAntominos() {
		return antominos;
	}
	
	
	
}
