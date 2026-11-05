class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Animal2 {

    public static void main(String[] args) {

        // Upcasting: Dog to Animal
        Animal a = new Dog();
        a.eat();

        // Safe downcasting using instanceof
        if (a instanceof Dog) {

            Dog d = (Dog) a;
            d.bark();

        } else {

            System.out.println("Not a Dog, cannot downcast safely");
        }
    }
}