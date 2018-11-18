package inheritance;

public class SuperCar extends Car {

    private SuperCar() {
    }

    public SuperCar(String inputName, String inputColor) {
        this.name = inputName;
        this.colour = inputColor;
    }

    @Override
    public void startEngine() {
        System.out.println("Start wrooooom, wroooommmmm");
    }

    @Override
    public void drive() {
        System.out.println("riding ultra fast");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("baaaaaammmmm");
    }
}
