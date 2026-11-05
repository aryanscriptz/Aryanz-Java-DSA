import java.util.Scanner;

class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            salary = newSalary;
        } else {
            System.out.println("Invalid salary!");
        }
    }
}

public class Employee2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
    System.out.println("Enter salary: " + n);
        Employee e = new Employee("Rahul", n);
S

        System.out.println(e.getSalary());

        e.setSalary(50000);
        System.out.println(e.getSalary());

        e.setSalary(-1000);
        System.out.println(e.getSalary());
    }
}