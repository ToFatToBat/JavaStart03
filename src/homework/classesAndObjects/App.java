package homework.classesAndObjects;

public class App {
    public static void main(String[] args) {
        Headphones JBL = new Headphones();
        Headphones Bose = new Headphones();

        JBL.make = "JBL";
        JBL.colour = "purple";
        JBL.bluetooth = true;

        Bose.make = "Bose";
        Bose.colour = "Black";
        Bose.bluetooth = true;

        System.out.println(JBL.toString());
        System.out.println(Bose.toString());

    }
}
