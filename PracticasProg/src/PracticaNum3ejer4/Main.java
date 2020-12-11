package PracticaNum3ejer4;


public class Main {

	public static void main(String[] args) {
		

		Episodio primert1 = new Episodio("piloto", "okk", 5, false);
		
		Episodio segundot1 = new Episodio("piloto2", "okk2", 5, true);
		
		Episodio tercerot1 = new Episodio("piloto2", "okk2", 3, true);
		
		Temporada primera = new Temporada();
		
		primera.agregarEpisodios(primert1);
		primera.agregarEpisodios(segundot1);
		primera.agregarEpisodios(tercerot1);
		
		///////////////////////////////////////////
		Episodio primert2 = new Episodio("piloto", "okk", 5, false);
		
		Episodio segundot2 = new Episodio("piloto2", "okk2", 5, true);
		
		Episodio tercerot2 = new Episodio("piloto2", "okk2", 1, true);
		
		Episodio cuartot2 = new Episodio("piloto2", "okk2", 2, true);
		
		Temporada segunda = new Temporada();
		
		segunda.agregarEpisodios(primert2);
		segunda.agregarEpisodios(segundot2);
		segunda.agregarEpisodios(tercerot2);
		segunda.agregarEpisodios(cuartot2);
		
		//////////////////////////////////////////
		Episodio primert3 = new Episodio("piloto", "okk", 5, false);
		
		Episodio segundot3 = new Episodio("piloto2", "okk2", 5, false);
		
		Episodio tercerot3 = new Episodio("piloto2", "okk2", 5, false);
		
		Episodio cuartot3 = new Episodio("piloto2", "okk2", 5, true);
		
		Temporada tercera = new Temporada();
		
		tercera.agregarEpisodios(primert3);
		tercera.agregarEpisodios(segundot3);
		tercera.agregarEpisodios(tercerot3);
		tercera.agregarEpisodios(cuartot3);
		
		//////////////////////////////////////////	
		
		Serie laToma = new Serie("La toma", "Robo a un banco", "Fefe", "terror");
		
		laToma.agregarTemp(primera);
		laToma.agregarTemp(segunda);
		laToma.agregarTemp(tercera);
		
		
		
		
		System.out.println(laToma.getCantidadEpisodiosVisto(0));
		System.out.println(laToma.getCantidadEpisodiosVisto());
		System.out.println(laToma.getPromedio(0));
		System.out.println(laToma.getPromedio());
		System.out.println(laToma.getSeVio());

		
	}

}
