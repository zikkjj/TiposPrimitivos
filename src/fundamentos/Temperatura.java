package fundamentos;

public class Temperatura {
	
	
	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C 
		
		final double FATOR = 5 / 9.0;
		final double AJUSTE = 32;
		
		double fahrenheit = 21;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("O resultado da conversão é:"+ " "+ celsius);
	}

}
