package s0105n1ejercicio1;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class OrdenAlfabetico {

	public static void ordenarDir(File directorio) {

		File[] ficheros = directorio.listFiles();
		
		List<File> ficherosList = Arrays.asList(ficheros);
		
		ficherosList.sort(null);
		
		for (int i = 0; i < ficheros.length; i++) {
			
			System.out.println(ficherosList.get(i));

		}

	}

}
