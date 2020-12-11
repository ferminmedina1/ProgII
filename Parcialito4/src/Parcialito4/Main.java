package Parcialito4;

public class Main {

	public static void main(String[] args) {
		
		Plataforma pla = new Plataforma();
		
		Pelicula p1 = new Pelicula("luna","la historia de la luna", "Martin Scorsese", 2016, 40,18);
		p1.addGenero("terror");
		p1.addGenero("suspenso");
		p1.addActor("Will Smith");
		

		Pelicula p2 = new Pelicula("flor de loto","la historia de la luna", "Fermin Medina", 2003, 140,18);
		p2.addGenero("romantica");
		p2.addGenero("terror");
		p2.addActor("Will Smith");
		
		Pelicula p3 = new Pelicula("la furia de la luna","la historia de la luna", "Martin Scorsese", 2008, 94,18);
		p3.addGenero("romantica");
		p3.addGenero("comedia");
		p3.addGenero("suspenso");
		p3.addActor("Will Smith");
		
		Pelicula p4 = new Pelicula("la furia de la luna","la historia de la luna", "Martin Scorsese", 2014, 110,18);
		p4.addGenero("romantica");
		p4.addGenero("documental");
		//p4.addGenero("comedia");

		
		pla.addPelicula(p1);
		pla.addPelicula(p2);
		pla.addPelicula(p3);
		Criterio tituloContieneCriterio = new CriterioTituloContiene("luna");
		Criterio generoEspecificoCriterio = new CriterioGenero("terror");
		Criterio conActorYsinDirector = new CriterioActorDirector("will smith", "martin scorsese");
		Criterio antesDeYduracionDe = new CriterioEstrenoDuracion(2015, 95);
		
		Criterio criterioRentable1 = new CriterioRentable1(120,"comedia");
		Criterio criterioRentable2 = new CriterioRentable2(2017, "infantil", "documental");
		
		
		//Estos sysout los puse de prueba. Los dejo por si los necesitan.
		System.out.println("Las peliculas que contienen la palabra 'luna' en su titulo son: " + pla.buscar(tituloContieneCriterio));
		System.out.println("Las peliculas que tienen de genero 'terror' son: " + pla.buscar(generoEspecificoCriterio));
		System.out.println("Las peliculas que actuo Will Smith y cuyo director no es Martin Scorsese son: " + pla.buscar(conActorYsinDirector));
		System.out.println("Las peliculas que salieron antes de 2015 y cuya duracion es menor a 95 min son: " + pla.buscar(antesDeYduracionDe));
		System.out.println("La pelicula "+ p3 +" es rentable? " + pla.isRentable(p4, criterioRentable1, criterioRentable2));
	}

}
