package homework.metody;

public class MethodLearning {
    private int a;
    private double b;
    private final double PI = 3.16;



    public void isEven (int a) {
        if( a % 2 == 0){

            System.out.println("Parzysta");
        }else {
            System.out.println("Nieparzysta");
        }
    }

    public boolean isOdd (int a){
        boolean oddCheck;
        if( a % 2 == 0){
            oddCheck = false;
        }else {
            oddCheck = true;
        }
        return oddCheck;
    }

    public double circleField(double b){
        return PI * (b *b);
    }

    public int power(int a) {
        return a * a;
    }
}
