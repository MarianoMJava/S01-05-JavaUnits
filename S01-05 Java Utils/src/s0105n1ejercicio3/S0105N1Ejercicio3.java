package s0105n1ejercicio3;

import java.io.File;
import java.util.Scanner;

public class S0105N1Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String rutaDir;
		
		System.out.print("Ingrese la ruta del directorio que quiere mostrar su arbol: ");
		
		rutaDir  = sc.nextLine();
		
		//rutaDir = "C:\\Users\\of_tecnica1\\eclipse-workspace\\S01-05 Java Utils";  ruta de prueba
				
		File directorio = new File(rutaDir);
		
		MostrarArbolWriteTxt.mostrarDirEj3(directorio);


	}

}
