package test;

import domain.Tiger;

public class TestAnimal {

    public static void main(String[] args) {
        Tiger tiger = new Tiger("Petya");
        System.out.println(tiger);
        tiger.hunt();
        tiger.eat();
        tiger.play();
        tiger.sleep();
    }
}
