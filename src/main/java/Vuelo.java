import java.util.ArrayList;

public class Vuelo {
	private Ciudad ciudadDestino;
	private Ciudad ciudadOrigen;
	private Fecha fechaOrigen;
	private Fecha fechaDestino;
	private ArrayList<Pasajero> pasajeros;
	private ArrayList<Piloto> pilotos;

	public Vuelo(Ciudad ciudadDestino, Ciudad ciudadOrigen, Fecha fechaOrigen, Fecha fechaDestino) {
		this.ciudadDestino = ciudadDestino;
		this.ciudadOrigen = ciudadOrigen;
		this.fechaOrigen = fechaOrigen;
		this.fechaDestino = fechaDestino;
	}

	public void agregarPasajero(Pasajero pasajero) {
		if (!pasajeros.contains(pasajero)) {
			if (pasajero.pasaporteValido()) {
				pasajeros.add(pasajero);
			} else {
				System.out.println("El pasaporte del pasajero no es válido.");
			}
		}
	}

	public void agregarPiloto(Piloto piloto) {
		if (!pilotos.contains(piloto)) {
			pilotos.add(piloto);
		}
	}
	public Ciudad getCiudadDestino() {
		return this.ciudadDestino;
	}

	public Ciudad getCiudadOrigen() {
		return this.ciudadOrigen;
	}

	public Fecha getFechaOrigen() {
		return this.fechaOrigen;
	}

	public Fecha getFechaDestino() {
		return this.fechaDestino;
	}

	public void operation() {
		throw new UnsupportedOperationException();
	}
}