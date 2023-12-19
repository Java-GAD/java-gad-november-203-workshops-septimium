package packageworkshop.overloading;

public class Multiplicator {
    public int multiply(int a, int b){
        return a*b;
    }

    public double multiply(double a, double b){
        return a*b;
    }
    public double multiply(double a, int b){
        return a*b;
    }
    public long multiply(long a, int b){
        return a*b;
    }
}
