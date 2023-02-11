
public class ExecutaMatriz {

	public static void main(String[] args) {
		
		String[] carros= {"HB20","Uno","Gol","Sandro","C3","Opala","Tempra"};
		
		/*System.out.println(carro[0]);
		System.out.println(carro[1]);
		System.out.println(carro[2]);
		System.out.println(carro[3]);
		System.out.println(carro[4]);*/
		
		System.out.println(carros.length);
		
		int contagem=1;
		
		for(int contador=0;contador<carros.length;contador++) {
			contagem=4+contador;
			System.out.println(contador+" - "+carros[contador]);
			
			
		}
		

	}

}
