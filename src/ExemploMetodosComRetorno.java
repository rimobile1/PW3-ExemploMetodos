
public class ExemploMetodosComRetorno {
	
	
	public static int  cubo (int num) {
		
	return num * num * num ;
	
	}
	
	public static void main(String[] args) {
		
		boolean resultado = possoIrBanco ("segunda",11);
		System.out.println(resultado);
	}

	public static String concatenar (String v1, String v2) {
		
    return v1 + " " + v2;
		
		
	}
	public static int sinal (int num) {
		
		if (num > 0) {
			
			return 1;
			
		} else if ( num < 0) {
			
			return -1;
			
			
		}
		
		else {
			return 0;

		}
		
	}
	
	public static boolean ehDiaSemana ( String dia) {
		
//		if (semana == "segunda" || semana =="terça" || semana == "quarta" || semana =="quinta" || semana =="sexta"  ) {
//			
//			return  true;
//			
//		} else {
//			
//		return false;
//
//		}
		
		if (dia.equalsIgnoreCase("sabado")|| dia.equalsIgnoreCase("domingo"))
		{ 
			
	    return false;
			
		}
		else { 
			
		return true;
			
		}
		
	    }
	
	public static boolean possoIrBanco(String dia, int hora) {
		
		boolean diaSemana = ehDiaSemana(dia);
		
		if (diaSemana == false)
		{ 
			
			return false;
			
			}
		else if(hora >= 10 && hora <=16) {
			
			return true;
			
		}
		
		else {
			
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
