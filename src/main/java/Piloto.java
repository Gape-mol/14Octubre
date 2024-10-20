import java.util.ArrayList;

public class Piloto {
	private String nombre;
	private String apellido;
	private String rut;
	private int edad;
	private int iD;

	public Piloto(String nombre, String apellido, String rut, int edad, int iD) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.edad = edad;
		this.iD = iD;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getID() {
		return this.iD;
	}

	public void setID(int iD) {
		this.iD = iD;
	}
}