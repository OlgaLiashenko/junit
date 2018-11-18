package inheritance;

public class UltraSuperCar extends SuperCar {

    public UltraSuperCar(String inputName, String inputColor) {
        super(inputName, inputColor);
    }

    @Override
    public void drive() {
        System.out.println("drive at supersonic speed");
    }

}
