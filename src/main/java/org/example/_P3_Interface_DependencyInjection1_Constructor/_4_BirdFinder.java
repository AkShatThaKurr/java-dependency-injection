package org.example._P3_Interface_DependencyInjection1_Constructor;

public class _4_BirdFinder {

    _1_Bird bird1;

    _4_BirdFinder(_1_Bird bird1){
        this.bird1 = bird1;
    }

    public void executeFly(){
        String result = bird1.fly();

        if(result.equals("low")){
            System.out.println("Low flying bird(Sparrow) detected.");
        }
        else if(result.equals("high")){
            System.out.println("High flying bird(Eagle) detected.");
        }
    }
}
