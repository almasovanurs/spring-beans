package peaksoft.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal{

    private int age;
    private String name;
    private AnimalsCage animalsCage;

    public Dog (){

    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
