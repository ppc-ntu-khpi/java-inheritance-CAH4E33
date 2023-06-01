package test;

import domain.Tiger;


/**
 * The class Test animal
 */
public class TestAnimal {


    /**
     *
     * Main
     *
     * @param args  the args.
     */
    public static void main(String[] args) {

        Tiger tiger = new Tiger("Petya");
        System.out.println(tiger);
        tiger.hunt();
        tiger.eat();
        tiger.play();
        tiger.sleep();
    }
}

