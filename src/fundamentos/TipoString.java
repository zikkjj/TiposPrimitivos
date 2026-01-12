package fundamentos;

// String é um objeto imutável

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Hello World!".charAt(4)); // valor literal, sem variável atribulada
		//Funcionalidade do String, pegar a letra em seu espaço determinado
		
		String s = "Boa tarde";
		s = s.toUpperCase(); // aqui não altera o valor original
		s = "Boa tarde"; // aqui modifica o valor original
		System.out.println(s.concat("!!!"));
		// pode-se usar o + no lugar do 'concat'
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.33;
		String maisUmaFrase = "Nome: "+ nome + 
				"\nSobrenome: " + sobrenome + 
				"\nIdade: " + idade + 
				"\nSalario: "+ salario + "\n\n";
		System.out.println(maisUmaFrase);
		
		System.out.println("Nome: "+ nome + 
				"\nSobrenome: " + sobrenome + 
				"\nIdade: " + idade + 
				"\nSalario: "+ salario + "\n\n");
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.",
				nome, 
				sobrenome, 
				idade, 
				salario);
		// o %s é para string, %d para inteiros e f para flutuantes. O 2f é para acrescentar duas casas decimais
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.",
				nome, 
				sobrenome, 
				idade, 
				salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual")); //verificação
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6, 9)); //por onde começar a string
	}

}
