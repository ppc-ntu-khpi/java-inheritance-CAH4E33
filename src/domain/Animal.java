package domain;

/**
 * The class Animal
 */
public class Animal {

    protected String name;

    protected  int weight;

    protected  int age;

    protected  String gender;

    protected  Boolean hungry;


    /**
     *
     * It is a constructor.
     *
     */
    public Animal() {

        name = "Animal";
        weight = 50;
        age = 15;
        gender = "female";
        hungry = true;

    }


    /**
     *
     * Eat
     *
     */
    public void eat() {

        System.out.println("Animal eating...");
    }


    /**
     *
     * Sleep
     *
     */
    public void sleep() {

        System.out.println("Animal sleeping...");
    }


    /**
     *
     * Play
     *
     */
    public void play() {

        System.out.println("Animal playing...");
    }

    @Override

/**
 *
 * To string
 *
 * @return String
 */
    public String toString() {

        return "Animal" + "\nname = " + name + ", \nweight = " + weight + " kg, \nage = " + age + ", \ngender = " + gender + ", \nhungry = " + hungry + '}';
    }


}


