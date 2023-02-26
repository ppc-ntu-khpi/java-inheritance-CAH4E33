package domain;

public class Tiger extends Animal {

    private String mood;

    public Tiger(String name, int weight, int age, String gender, Boolean hungry, String mood) {
        this.name=name;
        this.weight=weight;
        this.age=age;
        this.gender=gender;
        this.hungry=hungry;
        this.mood=mood;
        
    }

    public Tiger() {
        this("Vasya", 150, 20, "male",true,"good");
    }

    public Tiger(String name) {
        this(name, 150, 20, "male", true, "good");
    }
    
    

    public void hunt() {
        System.out.println("Tiger hunting...");
    }

    @Override
    public String toString() {
        return super.toString()+"\nmood: "+this.mood+"\n";
    }

    @Override
    public void play() {
       System.out.println("Tiger playing...");
    }

    @Override
    public void sleep() {
         System.out.println("Tiger sleeping...");
    }

    @Override
    public void eat() {
       System.out.println("Tiger eating...");
    }
    
    
}
