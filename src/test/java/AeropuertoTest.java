import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AeropuertoTest {

    @Test
    public void agregarAvion() {
        Aeropuerto aeropuerto = new Aeropuerto();
        Avion avion = new Avion(10);
        aeropuerto.agregarAvion(avion);
        assertTrue(aeropuerto.getAviones().contains(avion));
    }

    @Test
    public void crearVuelo() {
        Aeropuerto aeropuerto = new Aeropuerto();
        Avion avion = new Avion(10);
        Vuelo vuelo = new Vuelo(new Ciudad("Origen"), new Ciudad("Destino"), new Fecha(new Date(System.currentTimeMillis() + 10000L)), new Fecha(new Date(System.currentTimeMillis() + 10000L)));
        aeropuerto.agregarAvion(avion);
        aeropuerto.crearVuelo(avion, vuelo);
        assertTrue(avion.getVuelos().contains(vuelo));
    }

    @Test
    public void buscarVuelosFecha() {
        Aeropuerto aeropuerto = new Aeropuerto();
        Avion avion = new Avion(10);
        Fecha fecha = new Fecha(new Date(System.currentTimeMillis() + 10000L));
        Vuelo vuelo = new Vuelo(new Ciudad("Origen"), new Ciudad("Destino"), fecha, fecha);
        Vuelo vuelo2 = new Vuelo(new Ciudad("Origen"), new Ciudad("Destino"), new Fecha(new Date(System.currentTimeMillis() - 10000L)), new Fecha(new Date(System.currentTimeMillis() - 10000L)));
        aeropuerto.agregarAvion(avion);
        aeropuerto.crearVuelo(avion, vuelo);
        aeropuerto.crearVuelo(avion, vuelo2);
        ArrayList<Vuelo> vuelos = aeropuerto.buscarVuelosFecha(fecha);
        assertTrue(vuelos.contains(vuelo));
    }

}