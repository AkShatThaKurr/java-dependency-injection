package org.example._P3_Interface_DependencyInjection1_Constructor;

public class _5_Test {
    public static void main(String[] args) {

        // Creating low fly object.
        _2_LowFlyBirds lowFlyBirds = new _2_LowFlyBirds();
        _4_BirdFinder birdFinder1 = new _4_BirdFinder(lowFlyBirds);
        birdFinder1.executeFly();

        // Creating high fly object.
        _3_HighFlyBirds highFlyBirds = new _3_HighFlyBirds();
        _4_BirdFinder birdFinder2 = new _4_BirdFinder(highFlyBirds);
        birdFinder2.executeFly();
    }
}
