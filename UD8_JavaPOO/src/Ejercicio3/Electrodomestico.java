package Ejercicio3;

//@author Adrián Rodriguez

public class Electrodomestico {

	public static double precio = 100;
	public static Colores colorC = Colores.blanco;
	public static Consumos consumoC = Consumos.F;
	public static double pesoP = 5;
	
	private double precio_base;
	private Colores color;
	private Consumos consumo_energetico;
	private double peso;
	
	public Electrodomestico() {
		this.precio_base = precio;
		this.color = colorC;
		this.consumo_energetico = consumoC;
		this.peso = pesoP;
	}
	
	public Electrodomestico(double precio_base, double peso) {
		this.precio_base = precio_base;
		this.color = colorC;
		this.consumo_energetico = consumoC;
		this.peso = peso;
	}
	
	public Electrodomestico(double precio_base, Colores color, Consumos consumo_energetico, double peso) {
		this.precio_base = precio_base;
		this.color = color;
		this.consumo_energetico = consumo_energetico;
		this.peso = peso;
	}

	public String toString() {
		return "Electrodomestico [precio_base=" + precio_base + ", color=" + color + ", consumo_energetico="
				+ consumo_energetico + ", peso=" + peso + "]";
	}
}
