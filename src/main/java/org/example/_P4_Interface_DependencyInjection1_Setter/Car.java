// Setter dependency injection.

package org.example._P4_Interface_DependencyInjection1_Setter;

public class Car {
    Engine engine;

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public void Drive(){
        int result = engine.start();
        if(result>=1){
            System.out.println("Car running.. ");
        }
    }
}
