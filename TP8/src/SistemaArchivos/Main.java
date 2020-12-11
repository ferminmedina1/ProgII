package SistemaArchivos;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		Carpeta c1 = new Carpeta("general");
		Carpeta c2 = new Carpeta("imagenes");
		Carpeta c3 = new Carpeta("2020");
		Carpeta c4 = new Carpeta("documentos");
		Carpeta c5 = new Carpeta("musica");
		Carpeta c6 = new Carpeta("parciales");
		
		Archivo a1 = new Archivo("parcial 1",14);
		Archivo a2 = new Archivo("parcial 2",14);
		Archivo a3 = new Archivo("parcial 3",14);
		Archivo a4 = new Archivo("imagen 1",50);
		Archivo a5 = new Archivo("imagen 2",50);
		
		Link l1 = new Link("Acceso directo a parcial 3", a3);
		
		Comprimido com1 = new Comprimido("trap", 2);
		Archivo tema1 = new Archivo("no vendo trap",40);
		Archivo tema2 = new Archivo("si te sentis sola",40);
		Archivo tema3 = new Archivo("hello parcial",40);
		
		//GENERAL
		c1.agregarElemento(c2);
		c1.agregarElemento(c4);
		c1.agregarElemento(c5);
		c1.agregarElemento(l1);
		
		//IMAGENES
		c2.agregarElemento(c3);
		//2020
		c3.agregarElemento(a4);
		c3.agregarElemento(a5);
		
		//DOCUMENTOS
		c4.agregarElemento(c6);
		//Parciales
		c6.agregarElemento(a1);
		c6.agregarElemento(a2);
		c6.agregarElemento(a3);
		
		//MUSICA
		c5.agregarElemento(com1);
		//TRAP
		com1.agregarElemento(tema1);
		com1.agregarElemento(tema2);
		com1.agregarElemento(tema3);
		
		
		
		//BUSCADOR POR NOMBRE
		FiltroNombre filtroNombre = new FiltroNombre("parcial");
		System.out.println("Elementos con la palabra 'parcial': " + c1.buscar(filtroNombre));
		
		//BUSCADOR POR FECHA DE MODIFICACION
		FiltroModificacion filtroModificacion = new FiltroModificacion(LocalDate.of(2019, 3, 22));//BUSCA DESPUES'
		System.out.println("Elementos que fueron modificados despues de 22/03/2019" + c1.buscar(filtroModificacion));
		
		//BUSCADOR DE Todos los elementos que fueron creados antes del 15-03-2020 y cuyo nombre sea 'parcial' 
		FiltroModificacion filtroModificacion2 = new FiltroModificacion(LocalDate.of(2029,11, 22));//BUSCA DESPUES'
		FiltroNot filtroNot = new FiltroNot(filtroModificacion2);
		FiltroAnd filtroAnd = new FiltroAnd(filtroNot, filtroNombre);
		System.out.println("Elementos que fueron modificados antes del 22/11/2029 y el nombre sea parcial" + c1.buscar(filtroAnd));
		
		//BUSCARDOR POR NOMBRE ORDENADO ALFABETICAMENTE
		ComparadorNombre comparadorNombre = new ComparadorNombre();
		System.out.println("Elementos con la palabra 'parcial' ordenados alfabeticamente: " + c1.buscar(filtroNombre,comparadorNombre));
		
		
		//BUSCARDOR POR FECHA DE MODIFICACION ORDENADOS POR LA FECHA DE CREACION
		ComparadorFecha comparadorFecha = new ComparadorFecha();
		System.out.println("Elementos que fueron modificados despues de 22/03/2019 ordenados x fecha creacion: " + c1.buscar(filtroModificacion,comparadorFecha));
		
		//BUSCARDOR POR FECHA DE MODIFICACION ORDENADOS POR TAMANIO
		ComparatorTamanio comparadorTam = new ComparatorTamanio();
		System.out.println("Elementos que fueron modificados despues de 22/03/2019 ordenados x tamanio: " + c1.buscar(filtroModificacion,comparadorTam));
		
	}
}
