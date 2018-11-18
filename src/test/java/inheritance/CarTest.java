package inheritance;

import org.junit.Test;

public class CarTest {
    @Test
    public void firstCarTest() {
        SuperCar superCar = new SuperCar("ferrrari", "red");
        FamilyCar famCar = new FamilyCar("mazda", "silver");
        UltraSuperCar ultra = new UltraSuperCar("rocket", "magic");


        superCar.drive();
        ultra.drive();


        CarExamine.useCar(superCar);
        CarExamine.useCar(famCar);
        CarExamine.useCar(ultra);

    }
}
