import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		int valor1,valor2,opcao,resultado;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite o primeiro valor: ");
		valor1=teclado.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor2=teclado.nextInt();
		
		System.out.println();
		System.out.println("Escolha a opção abaixo desejada");
		System.out.println("===============================");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Divisão");
		System.out.println("4 - Multiplicação");
		System.out.println("===============================");
		System.out.println("Digite o número da opção: ");
		opcao=teclado.nextInt();
		
		//System.out.println("1 - Adição"+"\n"+"2 - Subtração"+"\n"+"3 - Divisão");
		
		switch (opcao) {
		case 1:
			resultado = valor1+valor2;
			System.out.println("A soma dos valores é :"+resultado);
			System.out.println("A soma dos valores: "+valor1+valor2);
			break;
			
		case 2:
			resultado = valor1-valor2;
			System.out.println("A subtração dos valores é: "+resultado);
			break;
			
		case 3:
			resultado=valor1/valor2;
		    System.out.println("A divisão dos valores é: "+resultado);
		    break;
		    
		case 4:
			resultado=valor1*valor2;
			System.out.println("A multiplicação dos valores é: "+resultado);
			break;
			
		default:
			System.out.println("ERROR!!! Opção Inválida");
			
			
			
		}
		
		

	}

}
