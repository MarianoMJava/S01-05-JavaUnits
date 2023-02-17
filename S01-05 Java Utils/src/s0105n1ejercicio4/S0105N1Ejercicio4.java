package s0105n1ejercicio4;

import java.io.File;
import java.util.Scanner;

import s0105n1ejercicio3.EscribirArbolTxt;
import s0105n1ejercicio2.MostrarArbol;

public class S0105N1Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String rutaDir;

		int op;

		do {
			System.out.println("------------MENU------------");
			System.out.println("1- Mostar arbol a partir de ruta de un directorio");
			System.out.println("2- Escribir arbol a partir de la ruta de un directorio");
			System.out.println("3- Leer archivo .txt");
			System.out.println("5- SALIR");
			
			System.out.print("Ingrese la opcion elegida: ");

			op = sc.nextInt();
			
			sc.nextLine();

			switch (op) {
			case 1:

				System.out.print("Ingrese la ruta del directorio que quiere mostrar su arbol por consola: ");

				rutaDir = sc.nextLine();

				File directorioMostrar = new File(rutaDir);

				MostrarArbol.mostrarArbol(directorioMostrar);

				break;

			case 2:

				System.out.print("Ingrese la ruta del directorio que quiere mostrar su arbol para luego escribirlo en un archivo .txt: ");

				rutaDir = sc.nextLine();

				File directorioEscribir = new File(rutaDir);

				EscribirArbolTxt.escribirEnTxt(directorioEscribir);

				break;
				
			case 3:
				
				System.out.print("Ingrese la ruta del directorio para ver archivos .txt: ");

				rutaDir = sc.nextLine();

				File directorioLeerTxt= new File(rutaDir);

				ReadTxt.leerTxt(directorioLeerTxt);

				break;
				
			case 5:
				
				System.out.println("SALIENDO...");
				
				break;

			default:

				System.out.println("Ha ingresado una opcion incorrecta, vuelva a intentarlo");

			}

		} while (op != 5);

	}

	}


