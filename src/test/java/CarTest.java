import oop.Car;
import org.junit.Test;

public class CarTest {

    @Test
    public void carRun() {
        Car car = new Car("Audi", 0, 150);

        car.go();
        car.addMoreFuel(111);
        car.startEngine();
        car.go(false);


        System.out.println();

    }


    // car.go();
}
