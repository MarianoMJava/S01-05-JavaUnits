package s0105n1ejercicio1;

import java.io.File;

public class PruebasRutas {

	public static void existeFichero(File archivo) {
		
		System.out.println("Existe el archivo?: "+archivo.exists());
		
	}
	
	public static void mostrarRuta(File archivo) {
		
		System.out.println(archivo.getAbsolutePath());
		
	}
	
	public static void mostrarDir(File archivo) {
		
		File [] ficheros = archivo.listFiles();
		
	for (int i = 0; i<ficheros.length; i++) {
		
	System.out.println(ficheros[i].getName());
		
		
	}
		
		
		
	}
	
}
