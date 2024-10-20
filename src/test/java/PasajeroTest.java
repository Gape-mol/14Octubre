import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PasajeroTest {

    @Test
    public void testPasajeroValido() {
         Pasaporte pasaporte = new Pasaporte(1, "Chilena", 10, new Date(System.currentTimeMillis() + 10000L));
         Pasajero pasajero = new Pasajero(pasaporte, "Nombre", "Apellido", 1  );
         assertTrue(pasajero.pasaporteValido());
     }

    @Test
    public void testPasajeroInvalido() {
        Pasaporte pasaporte = new Pasaporte(1, "Chilena", 10, new Date(System.currentTimeMillis() - 10000L));
        Pasajero pasajero = new Pasajero(pasaporte, "Nombre", "Apellido", 1 );
        assertFalse(pasajero.pasaporteValido());
    }

    @Test
    public void agregarVuelo(){
        Pasaporte pasaporte = new Pasaporte(1, "Chilena", 10, new Date(System.currentTimeMillis() + 10000L));
        Pasajero pasajero = new Pasajero(pasaporte, "Nombre", "Apellido", 1  );
        Vuelo vuelo = new Vuelo(new Ciudad("Origen") , new Ciudad("Destino"), new Fecha(new Date(System.currentTimeMillis() + 10000L)) , new Fecha(new Date(System.currentTimeMillis() + 10000L)));

        pasajero.agregarVuelo(vuelo);
        assertTrue(pasajero.getVuelos().contains(vuelo));
    }

}
