package sprint6ex;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ShipSpyTest {

    @Spy
    Sail sail = Mockito.spy(new Sail(3));

    @Test
    public void getMaxSpeed() {
        Ship ship = new Ship(sail);
        ship.getMaxSpeed();

        Mockito.verify(sail, Mockito.times(1)).getMaxPower();
    }
}