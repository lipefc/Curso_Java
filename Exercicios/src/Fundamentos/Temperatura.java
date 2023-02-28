package Fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {

		int F = 86;
		final int conversao1 = 32;
		final double conversao2 = 5.0 / 9.0;
		double C = (F - conversao1) * conversao2;
		
		System.out.println("Temperatura = " + C + "°c");
		
		F = 150;
		C = (F - conversao1) * conversao2;
		
		System.out.println("Temperatura = " + C + "°c");

	}
}
