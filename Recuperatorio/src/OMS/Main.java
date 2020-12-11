package OMS;

import Criterio.Criterio;
import Criterio.CriterioAnd;
import Criterio.CriterioContrajoEnfermedad;
import Criterio.CriterioEdadMayor;
import Criterio.CriterioEnfermedad;
import Criterio.CriterioGenero;
import Criterio.CriterioNacionalidad;
import Criterio.CriterioNot;
import Criterio.CriterioVacuna;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElementoCompuesto e1 = new ElementoCompuesto("Argentina");
		Persona p1 = new Persona("Fermin", "Argentina", 18, "masculino", true, true);
		Persona p2 = new Persona("Lucia", "Argentina", 66, "femenino", false, true);
		Persona p4 = new Persona("Martina", "Argentina", 66, "femenino", true, true);
		
		ElementoCompuesto e2 = new ElementoCompuesto("Buenos aires");
		Persona p3 = new Persona("Pepe", "Argentina", 43, "masculino", true, false);
		p3.addEnfermedad("diabetes");
		
		e1.addElemento(p1);
		e1.addElemento(p2);
		e2.addElemento(p3);
		e2.addElemento(p4);
		e1.addElemento(e2);
		
		GrupoPrivado g1 = new GrupoPrivado("country valle");
		Persona p5 = new Persona("milagros", "Argentina", 26, "femenino", true, true);
		Persona p6 = new Persona("martin", "Argentina", 26, "masculino", true, true);
		p6.addEnfermedad("asma");
		g1.addElemento(p5);
		g1.addElemento(p6);
		
		
		e1.addElemento(g1);
		
		System.out.println(e1.getCantidadVoluntariosTotal());  //Contar la cantidad de voluntarios que participaron del estudio.
		
		Criterio c1 = new CriterioVacuna();
		Criterio not = new CriterioNot(c1);
		System.out.println(e1.getCantVoluntariosConCriterio(not));//Contar la cantidad de voluntarios que recibieron un placebo.
		
		System.out.println(e1.getCantVoluntariosConCriterio(c1));//Contar la cantidad de voluntarios que recibieron un vacuna.
		
		Criterio c2 = new CriterioEnfermedad("diabetes");//Contar la cantidad de voluntarios con “diabetes” que recibieron la vacuna y no contrajeron la enfermedad.
		Criterio c3 = new CriterioContrajoEnfermedad();
		Criterio not2 = new CriterioNot(c3);
		Criterio and = new CriterioAnd(c2,c1);
		Criterio and2 = new CriterioAnd(and,not2);
		System.out.println(e1.getCantVoluntariosConCriterio(and2));
		
		
		System.out.println(e1.getPorcentaje(c1)); //Obtener el porcentaje de voluntarios que recibieron la vacuna.
		
		
		Criterio and3 = new CriterioAnd(c3, not);//Obtener el porcentaje de voluntarios que contrajeron la enfermedad y recibieron un placebo.
		System.out.println(e1.getPorcentaje(and3));
		
		
		Criterio c4 = new CriterioEdadMayor(60);//Obtener el porcentaje de voluntarios de más de 60 años, femeninos, de nacionalidad Argentina que recibieron la vacuna.
		Criterio c5 = new CriterioGenero("femenino");
		Criterio c6 = new CriterioNacionalidad("Argentina");
		Criterio and4 = new CriterioAnd(c4, c5);
		Criterio and5 = new CriterioAnd(c6, c1);
		Criterio and6 = new CriterioAnd(and4, and5);
		System.out.println(e1.getPorcentaje(and6));
		
	
		Criterio c7 = new CriterioEdadMayor(25);//Voluntarios de más de 25 años, que no posean hipertensión.
		Criterio c8 = new CriterioEnfermedad("hipertension");
		Criterio not3 = new CriterioNot(c8);
		Criterio and7 = new CriterioAnd(c7, not3);
		System.out.println(e1.getPosiblesVoluntarios(and7));
		
		
		Criterio c9 = new CriterioGenero("masculino");
		Criterio c10 = new CriterioEnfermedad("asma");
		Criterio not4 = new CriterioNot(c2);
		Criterio and8 = new CriterioAnd(c9, c10);
		Criterio and9 = new CriterioAnd(and8, not4);
		System.out.println(e1.getPosiblesVoluntarios(and9));//Voluntarios masculinos que padezcan asma, pero no sean diabéticos. SOLO ES MARTIN APTO PERO ES DEL COUNTRY VALLE
	
		
		Criterio c11 = new CriterioEnfermedad();//Voluntarios que no poseen enfermedades preexistentes.
		System.out.println(e1.getPosiblesVoluntarios(c11));
	}

}
