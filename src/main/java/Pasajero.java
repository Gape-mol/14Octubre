import java.util.ArrayList;

public class Pasajero {
	private Pasaporte pasaporte;
	private String nombre;
	private String apellido;
	private int rut;
	public ArrayList<Vuelo> pasajeros = new ArrayList<Vuelo>();

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public int getRut() {
		return this.rut;
	}

	public Pasaporte getPasaporte() {
		return this.pasaporte;
	}
}