import java.util.ArrayList;

public class Pasajero {
	private Pasaporte pasaporte;
	private String nombre;
	private String apellido;
	private int rut;
	public ArrayList<Vuelo> vuelos;

	public Pasajero(Pasaporte pasaporte, String nombre, String apellido, int rut) {
		this.pasaporte = pasaporte;
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.vuelos = new ArrayList<Vuelo>();
	}

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
	public ArrayList<Vuelo> getVuelos() {
		return this.vuelos;
	}

	public boolean pasaporteValido() {
		return this.pasaporte.isValido();
	}

	public void agregarVuelo(Vuelo vuelo) {
		if (!vuelos.contains(vuelo)) {
			vuelos.add(vuelo);
		}
	}
}