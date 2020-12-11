package Juego;

public class Atributo {
	
	private String nombreAtributo;
	private int valorAtributo;
	private double valorConPocima;
	
	public Atributo(String nombreAtributo,int valorAtributo) {
		this.nombreAtributo = nombreAtributo.toUpperCase();
		this.valorAtributo = valorAtributo;
		valorConPocima = valorAtributo;
	}
	
	public Atributo(String nombreAtributo) {
		this.nombreAtributo = nombreAtributo.toUpperCase();
	}

	public String getNombreAtributo() {
		return nombreAtributo;
	}
	public void setNombreAtributo(String nombreAtributo) {
		this.nombreAtributo = nombreAtributo;
	}

	public int getValor() {
		return valorAtributo;
	}

	public void setValor(int valorAtributo) {
		this.valorAtributo = valorAtributo;
	}

	public String toString() {
		return nombreAtributo;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			Atributo a = (Atributo) obj;
			if(this.getNombreAtributo().equals(a.getNombreAtributo())){
				return true;
			}else {
				return false;
			}
		}catch(Exception e){
			return false;
		}
	}

	public double getValorConPocima() {
		return valorConPocima;
	}

	public void setValorConPocima(double valorConPocima) {
		this.valorConPocima = valorConPocima;
	}
	
	
}
