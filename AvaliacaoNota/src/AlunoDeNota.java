import java.util.Scanner;

public class AlunoDeNota {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		String nomeDoAluno;
		int nota1,nota2,nota3,nota4;
		
		System.out.println("Digite o nome do aluno");
		
		nomeDoAluno = teclado.nextLine();
		
		System.out.println("A primeira nota");
		
		nota1 = teclado.nextInt();
		
		System.out.println("A segunda nota");
		
		nota2 = teclado.nextInt();
		
		System.out.println("A terceira nota");
		
		nota3 = teclado.nextInt();
		
		System.out.println("A quarta nota");
		
		nota4 = teclado.nextInt();
			
		int media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("A sua media: "+media);
			
		if (media < 7) {
			
			System.out.println(nomeDoAluno +"foi reprovado");	
		
		} else if (media >=7) {
		
			System.out.println(nomeDoAluno +" foi aprovado");
		
		}

	}

}
