// Example of Inheritance(Is-A) Relationship because we inherit the method of parent class.

package org.example._P1_Is_A__Relationship;

public class Sparrow extends Bird {
    public void flyHigh(){
        int fly = super.fly();
        if(fly>=1){
            System.out.println("Start fly high...");
        }
    }
}
