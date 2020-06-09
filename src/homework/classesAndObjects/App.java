package homework.classesAndObjects;

public class App {
    public static void main(String[] args) {
        Headphones JBL = new Headphones("JBL", "purple", true);
        Headphones Bose = new Headphones("Bose", "Black", true);


        System.out.println(JBL.toString());
        System.out.println(Bose.toString());

    }
}
