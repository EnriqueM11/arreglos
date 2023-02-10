package arreglos;

public class estudiantes {
	
	public int[] ver_resultado() {
	
		
        int []numeros= new int[15];
		numeros[9]=5;
		
		for (int i=0; i< numeros.length;i++) {
			System.out.print(numeros[i]);
			
		}
		return numeros;
	}
	
	public String[] borrar(String[] nombres, String objetivo_1) {
	    int i, j;
	    for (i = 0; i < nombres.length; i++) {
	        if (nombres[i].equals(objetivo_1)) {
	            break;
	        }
	    }
	    if (i == nombres.length) {
	        System.out.println("Valor no encontrado");
	        return nombres;   
	    }
	    for (j = i; j < nombres.length - 1; j++) {
	        nombres[j] = nombres[j + 1];
	    }
	    
	    String[] nombresn = new String[nombres.length - 1];
	    System.arraycopy(nombres, 0, nombresn, 0, j);
	    return nombresn;
	}
	
	
}
