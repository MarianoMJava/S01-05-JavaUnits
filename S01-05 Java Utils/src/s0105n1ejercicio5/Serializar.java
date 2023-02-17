package s0105n1ejercicio5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.Scanner;

public class Serializar {

	public static void serializando(Persona personas) {

		Persona personaDesserializada;

		try {

			Scanner sc = new Scanner(System.in);
			String ruta, nombreSerial;

			System.out.print("Ingrese la ruta donde desea guardar el archivo .ser: ");
			ruta = sc.nextLine();

			System.out.print("Ingrese el nombre del archivo donde guardar: ");
			nombreSerial = sc.nextLine();

			ObjectOutputStream escribiendoFicheroSerial = new ObjectOutputStream(
					new FileOutputStream(ruta + "\\" + nombreSerial + ".ser"));

			escribiendoFicheroSerial.writeObject(personas);

			escribiendoFicheroSerial.close();

			System.out.println("Desserializando");

			ObjectInputStream desserializarFichero = new ObjectInputStream(
					new FileInputStream(ruta + "\\" + nombreSerial + ".ser"));

			personaDesserializada = (Persona) desserializarFichero.readObject();

			desserializarFichero.close();

			System.out.println("Personas desserializadas: ");

			System.out.println(personaDesserializada);

		} catch (Exception e) {
			System.out.println("Hubo un problema");
			e.printStackTrace();
		}

	}

}
