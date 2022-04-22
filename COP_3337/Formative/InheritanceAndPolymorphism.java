package COP_3337.Formative;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class InheritanceAndPolymorphism {
    /*
     * You have been hired to create an app that keeps track of the individual animals (cats, dogs and birds) that are being transported to shelter up north for adoption.
     * Create the superclasses and subclasses needed, as well as an array to keep track of which animals are in each group being transported.
     */
    public void main() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Gaby", 6)); // My dog's name
        animals.add(new Cat("Boots", 4));
        animals.add(new Bird("Tweety", 5));
    }

    @Getter
    public class Animal {
        private final UUID id;
        private final String name;
        private final int age;

        public Animal(String name, int age) {
            this.id = UUID.randomUUID();
            this.name = name;
            this.age = age;
        }
    }

    public class Dog extends Animal {
        public Dog(String name, int age) {super(name, age);}
        public void bark() {System.out.println("Woof!");}
    }

    public class Cat extends Animal {
        public Cat(String name, int age) {super(name, age);}
        public void meow() {System.out.println("Meow!");}
    }

    public class Bird extends Animal {
        public Bird(String name, int age) {super(name, age);}
        public void chirp() {System.out.println("Chirp!");}
    }
}
