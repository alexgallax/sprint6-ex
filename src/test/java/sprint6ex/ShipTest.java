package sprint6ex;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ShipTest {

    @Mock
    Sail sail;

    @Test
    public void getMaxSpeed() {
        Mockito.when(sail.getMaxPower()).thenReturn(6);
        Ship ship = new Ship(sail);

        assertEquals(24, ship.getMaxSpeed());
    }
}