import java.util.ArrayList;

public class Vuelo {
	private Ciudad ciudadDestino;
	private Ciudad ciudadOrigen;
	private Fecha fechaOrigen;
	private Fecha fechaDestino;
	public ArrayList<Avion> vuelos = new ArrayList<Avion>();

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