package inheritance;

public abstract class Car implements CarInterface {
    String name;
    String colour;

    public String getCarDescription() {
        return "Car name is " + name + ". Car colour is " + colour + ".";
    }


}
