package s0105n1ejercicio3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class EscribirArbolTxt {

	public static void escribirEnTxt(File directorio) {

		ArrayList<String> rutaNombreArch = new ArrayList<String>();
		ArrayList<String> arbol = new ArrayList<String>();

		File[] ficheros = directorio.listFiles();

		int lengthDir = ficheros.length, i = 0;

		rutaNombreArch = crearArchivo();

		try {

			FileWriter myWriter = new FileWriter(rutaNombreArch.get(0) + "\\" + rutaNombreArch.get(1) + ".txt");

			arbol = writeArchivo(ficheros, lengthDir, arbol);

			while (i < arbol.size()) {

				myWriter.write(arbol.get(i));

				i++;
			}

			myWriter.close();

		} catch (IOException e) {

			System.out.println("Ocurrio un error al escribir el arcihvo");
		
		}

	}

	public static ArrayList<String> crearArchivo() {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> rutaNombreArch = new ArrayList<String>();

		String ruta, nombreArchivo;

		System.out.print("Ingrese la ruta donde desea guardar el archivo con el arbol de directorio: ");

		ruta = sc.nextLine();

		System.out.print("Ingrese el nombre del archivo que quiere crear: ");

		nombreArchivo = sc.nextLine();

		rutaNombreArch.add(ruta);
		rutaNombreArch.add(nombreArchivo);

		try {

			File myFile = new File(ruta + "\\" + nombreArchivo + ".txt");

			if (myFile.createNewFile()) {

				System.out.println("Archivo creado: " + myFile.getName());

			} else {

				System.out.println("El archivo ya existe");

			}

		} catch (IOException e) {
			System.out.println("Ha ocurrido un error al crear el archivo");

		}

		return rutaNombreArch;

	}

	public static ArrayList<String> writeArchivo(File[] ficheros, int lengthDir, ArrayList<String> arbol) {

		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");

		int i = 0;

		for (i = 0; i < lengthDir; i++) {

			if (ficheros[i].isDirectory()) {

				System.out.println(ficheros[i] + " (D) " + formato.format(ficheros[i].lastModified()));

				arbol.add(ficheros[i] + " (D) " + formato.format(ficheros[i].lastModified()) + "\n");

				File dirRec = new File(ficheros[i].getAbsolutePath());

				File[] ficRec = dirRec.listFiles();

				int ficRecLength = ficRec.length;

				writeArchivo(ficRec, ficRecLength, arbol);

			} else if (ficheros[i].isFile()) {

				System.out.println(ficheros[i] + " (F) " + formato.format(ficheros[i].lastModified()));

				arbol.add(ficheros[i] + " (F) " + formato.format(ficheros[i].lastModified()) + "\n");

			}

		}

		return arbol;
	}
}
