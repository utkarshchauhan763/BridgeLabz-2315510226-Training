// Animal Hierarchy - Demonstrates inheritance, method overriding, and polymorphism
// Best practices: private fields, @Override, clear documentation

abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name, int age) { super(name, age); }
    @Override
    public void makeSound() {
        System.out.println(getName() + " barks: Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) { super(name, age); }
    @Override
    public void makeSound() {
        System.out.println(getName() + " meows: Meow!");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) { super(name, age); }
    @Override
    public void makeSound() {
        System.out.println(getName() + " chirps: Tweet!");
    }
}

public class AnimalHierarchyDemo {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Rex", 5),
            new Cat("Whiskers", 3),
            new Bird("Tweety", 2)
        };
        for (Animal animal : animals) {
            animal.makeSound(); // Polymorphism in action
        }
    }
}
