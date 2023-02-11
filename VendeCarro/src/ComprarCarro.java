import java.util.Scanner;

public class ComprarCarro {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nomeCliente;
		int opcao =0;
		int tempo;
		double resultado,parcela,entrada,falta;
		double vender = 18000;
		
		System.out.println("Que horas são:");
		tempo = teclado.nextInt();
			
		if(tempo <=11) {
				
		System.out.println("Bom dia, sou Carlos vender meu carro. Qual é o seu nome? \n");
		}else if(tempo <=17) {
		
		System.out.println("Boa tarde, sou Carlos vender meu carro. Qual é o seu nome? \n");
		}else
		
		System.out.println("Boa noite, sou Carlos vender meu carro. Qual é o seu nome? \n");
			
		{
				
			nomeCliente = teclado.next();
			System.out.println();
			System.out.println("Carlos: Prezado"+" "+nomeCliente+", você tem interesse no meu carro? \n");
			System.out.println(nomeCliente+ " tenho, mas qual o valor? \n");
			System.out.println("Carlos: R$ " +vender+ " mil a vista, ou dar uma entrada e parcela o restante. \n");
			System.out.println(nomeCliente+ " a entrada é de quanto? ");
			entrada = teclado.nextDouble();
			System.out.println();
			System.out.println("Carlos: Entrada de R$ " +entrada+ " mil e parcela o restante em 12 vezes. \n");
			System.out.println(nomeCliente+ " tudo bem, aceito! \n");
			System.out.println("Carlos: Ok, podemos marcar para fazer o resgistro e cartorio. \n");
			
				while (opcao !=4) {
			
				System.out.println("============================== Fazer o orgamento do comprovante ===============================");
				System.out.println("1 - Estou vendendo o meu carro, no valor R$ 18 mil: ");
				System.out.println("2 - O valor da entrada é R$ "+entrada+" mil;");
				System.out.println("3 - O restante em 12 vezes; ");
				System.out.println("4 - Imprimir resultado. ");
				System.out.println("===============================================================================================");
			
				opcao = teclado.nextInt();
			
					switch (opcao) {
		
					case 1:
						System.out.println("O carro foi vendindo no valor R$ "+vender+", parcelado com a entrada R$ "+entrada+ "\n");
						break;
			
					case 2:
						resultado = entrada;
						falta = vender - entrada;
						System.out.println("O valor já pago da entrada R$: " +resultado+ "\n");
						System.out.println("Mais 12 vezes R$ "+falta+" sem juros o restante \n");
						break;
			
					case 3:
						resultado = vender - entrada;
						falta = vender - entrada; 
						resultado = falta/12;
						System.out.println("Em até 12 vezes de R$ "+falta/12+ " , total de R$ "+falta+ "\n");
						break;
			
					case 4:
						resultado = vender - entrada;
						falta = vender - entrada;
						resultado = falta;
						System.out.println("================================ Imprimir resultado =====================================");
						System.out.println();
						System.out.println("O valor já pago da entrada R$: " +entrada+ "\n");
						System.out.println("Em até 12 vezes de R$ "+falta/12+ "\n");
						System.out.println("Total R$ "+vender+ "\n");
						System.out.println("=======================================================================================");
						System.out.println();
						System.out.println("O carro está vendido pra você. \n");
						System.out.println("Obrigado, " +nomeCliente+"! \n");
						System.out.println("Foi muito bom, fazer negócio com você! \n");
						break;
			
						default:
							System.out.println("Opção inválida!");
							break;
								
					}
		
				}				

		}

	}			

}
