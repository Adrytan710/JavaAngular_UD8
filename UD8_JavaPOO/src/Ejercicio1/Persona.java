package Ejercicio1;
//  @author Adrián Rodriguez

public class Persona {

	private String nombre;
	private int edad;
	private String DNI;
	private String sexo;
	private double peso;
	private double altura;
	
	public Persona(String DNI) {
		this.nombre = "";
		this.edad = 0;
		this.DNI = "53654021N";
		this.sexo = "H";
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String nombre, int edad, String sexo, String DNI) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.DNI = "53654021N";
	}
	
	public Persona(String nombre, int edad, String DNI, String sexo, double peso, double altura) {
		this.nombre = "Adri";
		this.edad = 23;
		this.DNI = "53654021N";
		this.sexo = "H";
		this.peso = 70;
		this.altura = 1.77;
	}

	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	
	
}
