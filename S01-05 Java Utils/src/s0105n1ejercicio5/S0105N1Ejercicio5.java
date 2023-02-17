package s0105n1ejercicio5;

import java.util.Scanner;

import s0105n1ejercicio2.MostrarArbol;
import s0105n1ejercicio3.EscribirArbolTxt;
import s0105n1ejercicio4.ReadTxt;

import java.io.*;

public class S0105N1Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String rutaDir;

		int op;

		do {
			System.out.println("------------MENU------------");
			System.out.println("1- Mostar arbol a partir de ruta de un directorio");
			System.out.println("2- Escribir arbol a partir de la ruta de un directorio");
			System.out.println("3- Leer archivo .txt");
			System.out.println("4- Serializar guardar y desserializarlo");
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

				System.out.print(
						"Ingrese la ruta del directorio que quiere mostrar su arbol para luego escribirlo en un archivo .txt: ");

				rutaDir = sc.nextLine();

				File directorioEscribir = new File(rutaDir);

				EscribirArbolTxt.escribirEnTxt(directorioEscribir);

				break;

			case 3:

				System.out.print("Ingrese la ruta del directorio para ver archivos .txt: ");

				rutaDir = sc.nextLine();

				File directorioLeerTxt = new File(rutaDir);

				ReadTxt.leerTxt(directorioLeerTxt);

				break;

			case 4:
				Persona personas;

				personas = crearPersona();

				Serializar.serializando(personas);

				break;

			case 5:

				System.out.println("SALIENDO...");

				break;

			default:

				System.out.println("Ha ingresado una opcion incorrecta, vuelva a intentarlo");

			}

		} while (op != 5);

	}

	public static Persona crearPersona() {

		Scanner sc = new Scanner(System.in);
		Persona personas;

		String nombre, apellido;
		int edad;
	

		System.out.println("Por favor para crear una persona necesitamos los siguientes datos: ");
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		System.out.print("Apellido: ");
		apellido = sc.nextLine();
		System.out.print("Edad: ");
		edad = sc.nextInt();
		sc.nextLine();

		Persona persona = new Persona(nombre, apellido, edad);

		personas = persona;

		return personas;

	}
}