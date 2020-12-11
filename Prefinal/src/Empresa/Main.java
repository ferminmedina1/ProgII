package Empresa;

import Sueldos.Sueldo;
import Sueldos.SueldoFijo;
import Sueldos.SueldoPorHora;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpleadoConPersonal leon = new EmpleadoConPersonal("Leon", "Tripiana", 54, 1);
	
		EmpleadoCargoHumilde andres = new EmpleadoCargoHumilde("Andrés", "Zeon", 54, 1);
		EmpleadoConPersonal timoteo = new EmpleadoConPersonal("Timoteo", "Aleron", 54, 1);
		
		Sueldo s1 = new SueldoPorHora(2);
		
		Programador luisina = new Programador("Luisina", "Medina", 35, s1, 8, 3, 10);
		luisina.addEspecialidad("front end");

		Programador victoria = new Programador("victoria", "Medina", 35, s1, 8, 3, 10);
		victoria.addEspecialidad("back end");
		
		Programador soledad = new Programador("Soledad", "Gomez", 21, s1, 8, 3, 10);
		soledad.addEspecialidad("Django");
		soledad.addEspecialidad("JAVA");
		soledad.addEspecialidad("IA");
		soledad.addEspecialidad("PYTHON");
		
		EmpleadoConPersonal ciro = new EmpleadoConPersonal("Ciro", "Beeron", 54, 1);
		leon.addpersonasAcargo(andres);
		leon.addpersonasAcargo(timoteo);
		leon.addpersonasAcargo(luisina);
		
		andres.addpersonasAcargo(victoria);
		andres.addpersonasAcargo(soledad);
		andres.addpersonasAcargo(ciro);
		
		Programador maria = new Programador("Maria", "Gomez", 21, s1, 8, 3, 10);
		maria.addEspecialidad("angular");
		
		Programador jose = new Programador("Jose", "Gomez", 21, s1, 8, 3, 10);
		jose.addEspecialidad("react");
		
		ciro.addpersonasAcargo(maria);
		ciro.addpersonasAcargo(jose);
		
		Sueldo s2 = new SueldoFijo(10);
		
		Programador cortana = new Programador("cortana", "Gomez", 21, s2, 2, 0, 10);
		cortana.addEspecialidad("IA");
		Programador alexa = new Programador("alexa", "Gomez", 21, s1, 2, 0, 10);
		alexa.addEspecialidad("IA");
		Programador siri = new Programador("siri", "Gomez", 21, s1, 2, 1, 1);
		siri.addEspecialidad("IA");
		
		timoteo.addpersonasAcargo(cortana);
		timoteo.addpersonasAcargo(alexa);
		timoteo.addpersonasAcargo(siri);
		
		System.out.println(leon.getEmpleados());
	}

}
