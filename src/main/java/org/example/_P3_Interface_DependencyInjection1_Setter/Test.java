package org.example._P3_Interface_DependencyInjection1_Setter;

public class Test {
    public static void main(String[] args) {
        MHawk mhawk = new MHawk();
        Car car = new Car();
        car.setEngine(mhawk);
        car.Drive();
    }
}
