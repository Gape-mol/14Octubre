import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PasaporteTest {

    @Test
    public void testPasaporteValido() {
        Date fechaValida = new Date(System.currentTimeMillis() + 10000L);
        Pasaporte pasaporte = new Pasaporte(1, "Chilena", 10, fechaValida);
        assertTrue(pasaporte.isValido());
    }

    @Test
    public void testPasaporteInvalido() {
        Date fechaValida = new Date(System.currentTimeMillis() - 10000L);
        Pasaporte pasaporte = new Pasaporte(1, "Chilena", 10, fechaValida);
        assertFalse(pasaporte.isValido());
    }

}