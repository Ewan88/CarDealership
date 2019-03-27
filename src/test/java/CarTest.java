import behaviours.IDrive;
import car.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CarTest {

    Tank tank;
    PetrolCar petrolCar;
    ElectricCar electricCar;
    HybridCar hybrid;

    @Before
    public void setup(){
        tank = new Tank(120000, 90);
        petrolCar = new PetrolCar(30000, 120);
        electricCar = new ElectricCar(60000, 140);
        hybrid = new HybridCar(50000, 130);
    }

    @Test
    public void tankIsCar(){
        assert (petrolCar instanceof IDrive);
        assert (electricCar instanceof IDrive);
        assert (hybrid instanceof IDrive);
        assert (tank instanceof IDrive);
    }

    @Test
    public void carsCanDrive(){
        assertEquals("You are travelling at: 120mph", petrolCar.drive());
        assertEquals("You are travelling at: 140mph", electricCar.drive());
        assertEquals("You are travelling at: 130mph", hybrid.drive());
        assertEquals("You are travelling at: 90mph", tank.drive());
    }



}
