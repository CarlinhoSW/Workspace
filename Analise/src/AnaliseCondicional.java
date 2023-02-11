import java.util.Scanner;

public class AnaliseCondicional {

	public static void main(String[] args) {
		int tempo;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite que horas são:");
		
		tempo =teclado.nextInt();
		
		if(tempo<=11) {
			
			System.out.println("Bom dia");
		}else if(tempo<=17) {
			
			System.out.println("Boa tarde");
		}else 
			
			System.out.println("Boa noite");

	}

}
