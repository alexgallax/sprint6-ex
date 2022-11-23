package sprint6ex;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class SailTest {

    @Test
    public void getMaxPower() {
        Sail sail = new Sail(3);

        assertEquals(6, sail.getMaxPower());
    }
}