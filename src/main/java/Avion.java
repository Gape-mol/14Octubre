import java.util.ArrayList;

public class Avion {
	private ArrayList<Vuelo> vuelos;
	private int pasajerosMaximos;

	public Avion(int pasajerosMaximos) {
		this.pasajerosMaximos = pasajerosMaximos;
		vuelos = new ArrayList<Vuelo>();
	}

	public void agregarVuelo(Vuelo vuelo) {
		if (!vuelos.contains(vuelo)) {
			vuelos.add(vuelo);
		}
	}
	public ArrayList<Vuelo> getVuelos() {
		return this.vuelos;
	}
}
