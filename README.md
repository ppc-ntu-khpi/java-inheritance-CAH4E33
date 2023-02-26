# Практична робота "Реалізація успадкування"


<img src="https://github.com/ppc-ntu-khpi/java-inheritance-CAH4E33/blob/master/image/tiger1.png" width="100%"/>
<img src="https://github.com/ppc-ntu-khpi/java-inheritance-CAH4E33/blob/master/image/Tiger.png" width="100%"/>


## Код програми

* Клас Animal
```java
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
        return "Animal" + "\nname = " + name + ", \nweight = " + weight + " kg, "
                + "\nage = " + age + ", \ngender = " + gender + ", \nhungry = " + hungry+ ",";
    }

   
}
```
* Клас Tiger
```java
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
```
* Клас TestAnimal
```java
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
```


