package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1.123456789; //Implícita
		System.out.println(a);
		
		float b = (float) 1.123456789; //Explícita (CAST)
		System.out.println(b);
		
		int c = 340; //Explícita (CAST)
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.123456789; //Explícita (CAST)
		int f = (int) e;
		System.out.println(f);
	}
}
