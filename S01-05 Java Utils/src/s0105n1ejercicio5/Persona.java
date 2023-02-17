package s0105n1ejercicio5;

import java.io.Serializable;

public class Persona implements Serializable {

	private String nombre;
	private String apellido;
	private int edad;
	private static int cantidad = 0;

	public Persona(String nombre, String apellido, int edad) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		Persona.cantidad = +1;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static int getCantidad() {
		return cantidad;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nApellido:" + apellido + "\nEdad:" + edad;
	}

}
