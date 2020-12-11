package PracticaNum3;

public class Main {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona(43857576, "Cristina", "Lapena", "Femenino", 19, 12,1,2002, 100, 1.55);
		
		
		System.out.println("DNI: " + persona1.getDni());
		
		System.out.println("Nombre: " + persona1.getNombre());
		
		System.out.println("Apellido: " + persona1.getApellido());
		
		System.out.println("Sexo: " + persona1.getSexo());
		
		System.out.println("Edad: " + persona1.getEdad());
		
		System.out.println("Altura: " + persona1.getAltura());
		
		System.out.println("Peso: " + persona1.getPeso());
		
		System.out.println("Fecha nacimiento: " + persona1.getDiaNacimiento() + "/" + persona1.getMesNacimiento() + "/" + persona1.getAnioNacimiento());
		
		System.out.println("Masa corporal: " + persona1.getMasa());
		
		System.out.println("Esta en forma? : " + persona1.isEnForma());

		System.out.println("Es su cumpleaños? : " + persona1.isCumpleaneos());
		
		System.out.println("Es mayor de edad? : " + persona1.isMayorEdad());
		
		System.out.println("Puede votar? : " + persona1.isPoderVotar());
		
		System.out.println("Tiene coherencia la fecha de nacimiento con la edad? : " + persona1.isCoherenciaEdad());
	}
	

}
