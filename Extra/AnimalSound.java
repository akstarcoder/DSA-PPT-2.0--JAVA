// Animal superclass
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}
// Dog
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bhow Bhow");
    }
}
// Cat
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}
// Cow
class Cow extends Animal {
    public void makeSound() {
        System.out.println("Hambaa");
    }
}
// Main Class
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog(); 
        Animal cat = new Cat(); 
        Animal cow = new Cow(); 
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        cow.makeSound();
    }
}
