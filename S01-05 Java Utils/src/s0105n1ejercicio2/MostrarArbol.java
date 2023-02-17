package s0105n1ejercicio2;

import java.io.File;
import java.text.SimpleDateFormat;

public class MostrarArbol {

	public static void mostrarArbol(File directorio) {

		File[] ficheros = directorio.listFiles();

		int lengthDir = ficheros.length;

		recursion(ficheros, lengthDir);

	}

	public static void recursion(File[] ficheros, int lengthDir) {

		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");

		int i = 0;

		for (i = 0; i < lengthDir; i++) {

			if (ficheros[i].isDirectory()) {

				System.out.println(ficheros[i] + " (D) " + formato.format(ficheros[i].lastModified()));

				File dirRec = new File(ficheros[i].getAbsolutePath());

				File[] ficRec = dirRec.listFiles();

				int ficRecLength = ficRec.length;

				recursion(ficRec, ficRecLength);

			} else if (ficheros[i].isFile()) {

				System.out.println(ficheros[i] + " (F) " + formato.format(ficheros[i].lastModified()));

			}

		}

	}

}
