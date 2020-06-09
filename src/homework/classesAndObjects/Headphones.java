package homework.classesAndObjects;

public class Headphones {
    String make;
    String colour;
    boolean bluetooth;

    @Override
    public String toString() {
        return "Headphones{" +
                "make='" + make + '\'' +
                ", colour='" + colour + '\'' +
                ", bluetooth=" + bluetooth +
                '}';
    }
}
