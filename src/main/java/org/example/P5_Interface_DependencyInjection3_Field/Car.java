package org.example.P5_Interface_DependencyInjection3_Field;

public class Car {
    // field dependency injecting
    Engine engine = new MHawk();


    public void Drive(){
        int result = engine.start();
        if(result>=1){
            System.out.println("Car is running...");
        }
        else{
            System.out.println("Car is not running...");
        }
    }
}
