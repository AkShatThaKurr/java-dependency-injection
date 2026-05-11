package org.example._P3_Interface_DependencyInjection1_Constructor;

public class _2_LowFlyBirds implements _1_Bird {
    public String fly(){
        System.out.println("Bird is flying at a low height.");
        return "low";
    }
}
