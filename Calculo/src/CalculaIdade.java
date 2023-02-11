import java.util.Scanner;

public class CalculaIdade {

	public static void main(String[] args) {
		String nome;
		int AnoNasc, AnoAtual;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		nome = teclado.nextLine();
		
		System.out.println("Digite o seu ano de nascimento" );
		AnoNasc = teclado.nextInt();
		
		System.out.println("Digite o ano atual");
		AnoAtual = teclado.nextInt();
		
		System.out.println(nome+" "+AnoNasc+ " "+AnoAtual);
		
		int Resposta = AnoAtual-AnoNasc;
		
		System.out.println(nome+ " a sua idade é "+ Resposta);
		
		

	}

}
