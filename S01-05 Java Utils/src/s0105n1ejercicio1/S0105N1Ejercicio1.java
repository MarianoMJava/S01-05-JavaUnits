package s0105n1ejercicio1;

import java.io.File;
import java.util.Scanner;

public class S0105N1Ejercicio1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String rutaDir;
		
		rutaDir  = sc.nextLine();
				
		File directorio = new File(rutaDir);
		
		OrdenAlfabetico.ordenarDir(directorio);

	}
}

