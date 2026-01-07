package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações do funcionário
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23; // -128 a 127
		short numeroDeVoos = 542; // -32768 a 32767
		int id = 56789; // -2147483648 a 2147483647
		
		/* Usar um 'L' no final do long para definir como Long */
		long pontosAcumulados = 3_134_845_223L; // -9223372036854775808 a 9223372036854775807
		
		
		// Tipos numéricos reais (com pontos flutuantes)
		float salario = 11_445.44F; // O F é para o Java entender que é um literal Float, e não Double
		double vendasAcumuladas = 2_991_797_103.91;
		
		// Tipo booleano
		boolean estaDeFerias = false; // false ou true
		
		// Tipo caractere
		char status = 'A'; //ativo, pode usar apenas um único caractere
		
		// Dias da empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos acumulados
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias?: " + estaDeFerias);
		System.out.println("Status: " + status);
	}

}
