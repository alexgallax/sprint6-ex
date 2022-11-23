package sprint6ex;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ShipParamsTest {

    @Parameterized.Parameter()
    public int power;
    @Parameterized.Parameter(1)
    public int expectedSpeed;

    @Mock
    Sail sail;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Parameterized.Parameters(name = "Sail power: {0}, expected ship speed: {1}")
    public static Object[][] params() {
        return new Object[][] {
                { 6, 24 },
                { 3, 12 }
        };
    }

    @Test
    public void getMaxSpeed() {
        Mockito.when(sail.getMaxPower()).thenReturn(power);
        Ship ship = new Ship(sail);

        assertEquals(expectedSpeed, ship.getMaxSpeed());
    }
}