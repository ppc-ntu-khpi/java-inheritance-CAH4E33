package domain;


/**
 * The class Tiger extends animal
 */
public class Tiger extends Animal {

    private String mood;


    /**
     *
     * Tiger
     *
     * @param name  the name.
     * @param weight  the weight.
     * @param age  the age.
     * @param gender  the gender.
     * @param hungry  the hungry.
     * @param mood  the mood.
     * @return public
     */
    public Tiger(String name, int weight, int age, String gender, Boolean hungry, String mood) {

        this.name=name;
        this.weight=weight;
        this.age=age;
        this.gender=gender;
        this.hungry=hungry;
        this.mood=mood;

    }


    /**
     *
     * Tiger
     *
     * @return public
     */
    public Tiger() {

        this("Vasya", 150, 20, "male",true,"good");
    }


    /**
     *
     * Tiger
     *
     * @param name  the name.
     * @return public
     */
    public Tiger(String name) {

        this(name, 150, 20, "male", true, "good");
    }




    /**
     *
     * Hunt
     *
     */
    public void hunt() {

        System.out.println("Tiger hunting...");
    }

    @Override

/**
 *
 * To string
 *
 * @return String
 */
    public String toString() {

        return super.toString()+"\nmood: "+this.mood+"\n";
    }

    @Override

/**
 *
 * Play
 *
 */
    public void play() {

        System.out.println("Tiger playing...");
    }

    @Override

/**
 *
 * Sleep
 *
 */
    public void sleep() {

        System.out.println("Tiger sleeping...");
    }

    @Override

/**
 *
 * Eat
 *
 */
    public void eat() {

        System.out.println("Tiger eating...");
    }


}

