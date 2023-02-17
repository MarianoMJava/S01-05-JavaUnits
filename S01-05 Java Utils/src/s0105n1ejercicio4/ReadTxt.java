package s0105n1ejercicio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import s0105n1ejercicio2.MostrarArbol;

public class ReadTxt {
	
	public static void leerTxt(File directorioLeerTxt) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dentro del directorio indicado tiene los siguientes archivos");
		
		MostrarArbol.mostrarArbol(directorioLeerTxt);
		
		System.out.print("\nIndique el nombre del archivo TXT que deasea leer: ");
		
		String nombreArchivo = sc.nextLine();
				
		try {
			
			File myTxt = new File (directorioLeerTxt + "\\" +nombreArchivo+".txt");
			
			Scanner myReader = new Scanner(myTxt);
			
			while (myReader.hasNextLine()) {
				String texto = myReader.nextLine();
				System.out.println(texto);
			}
			
			myReader.close();
						
		}catch(FileNotFoundException e) {
			
			System.out.println("Archivo .txt no encontrado");
			
		}
		
	}

}
