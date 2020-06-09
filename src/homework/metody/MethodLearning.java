package homework.metody;

public class MethodLearning {
    private int a;
    private double b;
    private final double PI = 3.16;

    public MethodLearning(int a, double b) {
        this.a = a;
        this.b = b;
    }

    public void isEven () {
        if( a % 2 == 0){

            System.out.println("Parzysta");
        }else {
            System.out.println("Nieparzysta");
        }
    }

    public boolean isOdd (){
        boolean oddCheck;
        if( a % 2 == 0){
            oddCheck = false;
        }else {
            oddCheck = true;
        }
        return oddCheck;
    }

    public double circleField(){
        return PI * (b *b);
    }

    public int power() {
        return a * a;
    }
}
