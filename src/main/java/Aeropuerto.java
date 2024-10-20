import java.util.ArrayList;
import java.util.Date;

public class Aeropuerto {
	private ArrayList<Avion> aviones = new ArrayList<Avion>();

	public void agregarAvion(Avion avion) {
		aviones.add(avion);
	}
	public void crearVuelo(Avion avion, Vuelo vuelo) {
		avion.agregarVuelo(vuelo);
	}
	public void RegistrarPasajero(Vuelo vuelo, Pasajero pasajero) {
		vuelo.agregarPasajero(pasajero);
	}
	public void RegistrarPiloto(Vuelo vuelo, Piloto piloto) {
		vuelo.agregarPiloto(piloto);
	}

	public ArrayList<Vuelo> buscarVuelosFecha(Fecha fecha) {
		ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();
		for (Avion avion : aviones) {
			for (Vuelo vuelo : avion.getVuelos()) {
				if (vuelo.getFechaOrigen().equals(fecha)) {
					vuelos.add(vuelo);
				}
			}
		}
		return vuelos;
	}

	public ArrayList<Avion> getAviones() {
		return this.aviones;
	}
}