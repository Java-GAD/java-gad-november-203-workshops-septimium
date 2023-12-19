package packageworkshop;

import packageworkshop.overloading.Multiplicator;
import packageworkshop.polymorphism.Audi;
import packageworkshop.polymorphism.BMW;
import packageworkshop.polymorphism.Car;

public class Main {
    public static void main(String args[]){
        Car c1 = new BMW();
        Car c2 = new Audi();
        Car c3 = new Car();
        c1.getBrand();
        c2.getBrand();
        c3.getBrand();
        Multiplicator m1 = new Multiplicator();
        m1.multiply(1.2, 3);
    }
}
