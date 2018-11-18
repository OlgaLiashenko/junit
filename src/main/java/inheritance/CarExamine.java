package inheritance;

public class CarExamine {

    public static void useCar(CarInterface car) {
        car.startEngine();
        car.drive();
        car.makeSomeNoise();
    }
}
