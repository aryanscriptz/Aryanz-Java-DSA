class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private int rollNumber;

    Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    public void display() {
            super.display();
       
       
            System.out.println("Roll Number: " + rollNumber);
    }
}

public class Person1 {
    public static void main(String[] args) {
        Student s = new Student("Aryan", 50, 191);

        s.display();
    }
}