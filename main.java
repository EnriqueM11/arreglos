package arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 estudiantes e= new estudiantes();
		 Scanner scan= new Scanner(System.in);
		 int opcion;
		 String opcion_2;

	        int []numeros= new int[15];
			numeros[9]=5;
			
			String []nombres= new String[20];
			nombres[0]="Francisco";
			nombres[1]="Eduardo";
			nombres[2]="Enrique";
			nombres[3]="Roberto";
			nombres[4]="Luis";
			
			for (int i=0; i< numeros.length;i++) {
				System.out.print(", "+numeros[i]);	
			}
			
			System.out.println("\nEscribe el valor que deseas buscar de la clase numeros:");
			opcion= scan.nextInt();
		
		    int objetivo = opcion;
		    boolean found = false;
		    for (int i = 0; i < numeros.length; i++) {
		        if (numeros[i] == objetivo) {
		            System.out.println("Valor encontrado en el lugar " + i);
		            found = true;
		            break;
		        }
		    }
		    if (!found) {
		        System.out.println("Valor no encontrado en el arreglo");
		    }
		    
		   
		    System.out.println("Escribe el valor que deseas borrar de la clase nombres:");
			opcion_2= scan.next();
		    
		        String objetivo_1 = opcion_2;
		        
		        nombres = e.borrar(nombres, objetivo_1);
		        System.out.println("Arreglo despues de borrar el valor " + Arrays.toString(nombres));
		    
			
	}
}
