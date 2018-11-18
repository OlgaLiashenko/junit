package inheritance;

public class FamilyCar extends Car {


    public FamilyCar(String name, String color) {
        this.name = name;
        this.colour = color;
    }

    @Override
    public void startEngine() {
        System.out.println("Start uamm.");
    }

    @Override
    public void drive() {
        System.out.println("Start driving slowly.");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("bummm");
    }
}
