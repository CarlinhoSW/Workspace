import java.util.Scanner;

public class InteracaoTeclado {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
        
		String nomeCliente;
		System.out.println("Digite o nome do seu cliente:");
		
		nomeCliente = teclado.nextLine();
		
		System.out.println("Olá "+nomeCliente);
		
		
	}

}
