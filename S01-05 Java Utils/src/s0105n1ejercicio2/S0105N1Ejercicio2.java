package s0105n1ejercicio2;

import java.io.File;
import java.util.Scanner;

public class S0105N1Ejercicio2 {

	public static void main(String[] args) {
	
			
			Scanner sc = new Scanner(System.in);
			
			String rutaDir;
			
			System.out.print("Ingrese la ruta que desea mostrar su arbol: ");
			
			rutaDir  = sc.nextLine();
					
			File directorio = new File(rutaDir);
			
			MostrarArbol.mostrarArbol(directorio);


	}

}
