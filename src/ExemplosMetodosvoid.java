

public class ExemplosMetodosvoid {
	
	public static void main(String[] args) {
		
		//saudacao(1);//
		
		//dobro(4);//
		
		tamanho ("icaro");
		
	    //soma (3,4);//
		
	}
	
	public static void saudacao(int periodo) {
		
		 
		if (periodo == 1) {
			System.out.println("Bom dia");
			
		} else if (periodo == 2) {
			System.out.println("Boa Tarde");
		
		}
		else if (periodo == 3) {
			System.out.println("Boa Noite");
		
		}
		else{
			System.out.println("Ola");
		}
		
		//System.out.println("Boa Noite");//
				
		
	}
	
	 public static void dobro (int valor) {
		 
		 int resultado = valor * 2 ;
		 
		 System.out.println("O dobro : " + resultado);
		 	 
	 }
	
	 
	 
	public static void metade (double valor) {
		
		double resultado = valor  /2 ;
		 
		 System.out.println("A meta é: " + resultado);
		
		
	}
	
	
	
public static void tamanho ( String nome  ) {
			 
		 //System.out.println(" O Tamnho é de : " + nome.length() + " letras " );
	
	     System.out.println(String.format(" O Tamnho é de %s letras ", nome.length()) );
	
}



public static void soma (int valor, int valor2) {
	
	int resultado = valor + valor2 ;
	 
	 System.out.println("Resultado: " + resultado);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

