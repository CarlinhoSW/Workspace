
public class GeradorTabuada {

	public static void main(String[] args) {
		
		int num_tabuada, valor_tabuada;
		
		num_tabuada=5;
		
		for(int contador=1; contador <=10;contador++) {
			
			valor_tabuada=num_tabuada*contador;
			
			System.out.println(num_tabuada+" x "+contador+" = "+valor_tabuada);
		}

	}

}
