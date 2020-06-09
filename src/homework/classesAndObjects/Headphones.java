package homework.classesAndObjects;

public class Headphones {
    String make;
    String colour;
    boolean bluetooth;

    public Headphones(String make, String colour, boolean bluetooth) {
        this.make = make;
        this.colour = colour;
        this.bluetooth = bluetooth;
    }

    @Override
    public String toString() {
        return "Headphones{" +
                "make='" + make + '\'' +
                ", colour='" + colour + '\'' +
                ", bluetooth=" + bluetooth +
                '}';
    }
}
