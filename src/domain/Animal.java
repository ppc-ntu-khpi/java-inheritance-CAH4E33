package domain;

public class Animal {

    protected String name;

    protected  int weight;

    protected  int age;

    protected  String gender;

    protected  Boolean hungry;

    public Animal() {
        name = "Animal";
        weight = 50;
        age = 15;
        gender = "female";
        hungry = true;
        
    }

    public void eat() {
        System.out.println("Animal eating...");
    }

    public void sleep() {
        System.out.println("Animal sleeping...");
    }

    public void play() {
        System.out.println("Animal playing...");
    }

    @Override
    public String toString() {
        return "Animal" + "\nname = " + name + ", \nweight = " + weight + " kg, \nage = " + age + ", \ngender = " + gender + ", \nhungry = " + hungry + '}';
    }

   
}
