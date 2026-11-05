class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void vaccination() {
        System.out.println("Dog vaccination tracking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Mainn {
    public static void main(String[] args) {

        Animal animal1 = new Dog();

        if (animal1 instanceof Dog) {
            Dog dog = (Dog) animal1;
            dog.vaccination();
        }

        Animal animal2 = new Cat();

        if (animal2 instanceof Dog) {
            Dog dog = (Dog) animal2;
            dog.vaccination();
        } else {
            System.out.println("The object is not a Dog");
        }
    }
}