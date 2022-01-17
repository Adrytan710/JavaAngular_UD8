package Ejercicio2;

//@author Adrián Rodriguez

public class MainPassword {

	public static void main(String[] args) {
		Password p1 = new Password();
		Password p2 = new Password(8);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}

}
