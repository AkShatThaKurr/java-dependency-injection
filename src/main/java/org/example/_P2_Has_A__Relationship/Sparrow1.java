// Example of Composition(Has-A) Relationship because we are creating object of another class.

package org.example._P2_Has_A__Relationship;

public class Sparrow1 {
    public void flyHigh1(){
        Bird1 obj = new Bird1();
        int fly1 = obj.fly1();
        if(fly1>=1){
            System.out.println("Start fly high...");
        }
    }
}
