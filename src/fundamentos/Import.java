package fundamentos;


/* Os imports são buscados fora da classe*/
import java.util.Date; // pacote importando dentro dos pacotes java


public class Import {
	public static void main(String[] args) {
		String s = "Bom dia";
		System.out.println(s);
		
		java.lang.String b = "Boa tarde!";
		System.out.println(b);
		
		Date d = new Date();
		System.out.println(d);
		
	}
}
