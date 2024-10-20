import java.util.Date;

public class Pasaporte {
	private int iD;
	private String nacionalidad;
	private int cantidadDeHojasDispnibles;
	private Date fechaDeExpiracion;

	public Pasaporte(int iD, String nacionalidad, int cantidadDeHojas, Date fechaDeExpiracion) {
		this.iD = iD;
		this.nacionalidad = nacionalidad;
		this.cantidadDeHojasDispnibles = cantidadDeHojas;
		this.fechaDeExpiracion = fechaDeExpiracion; ;
	}

	public int getID() {
		return this.iD;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public int getCantidadDeHojasDispnibles() {
		return this.cantidadDeHojasDispnibles;
	}

	public Date getFechaDeExpiracion() {
		return this.fechaDeExpiracion;
	}

	public boolean isValido() {
		return this.fechaDeExpiracion.after(new Date());
	}
}