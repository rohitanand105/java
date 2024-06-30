package extra;
import java.util.*;
import bank.*;

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing something");
    }

    public void pencolor() {
        System.out.println(this.color);

    }
}

class Student {
    String name;
    int age;

    // This is polymorphism in which same name function can make in same class
    public void printinfo(String name) {
        System.out.println(name);

    }

    public void printinfo(int age) {
        System.out.println(age);
    }
    // Student(String name, int age){ //this is a parameterized constructor
    // this.name = name;
    // this.age = age;
    // }

    Student(Student s2) { // this is a Copy constructor
        this.name = s2.name;
        this.age = s2.age;
    }

    Student() { // tHis is a constructor

    }

}

// Inheritance Start
class Shape {
    String color;

    public void area() {
        System.out.println("Display area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(l / 2 * l * h);
    }
}

class Circle extends Shape {
    public void are(int r) {
        System.out.println((3.14) * r * r);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(l / 2 * l * h);
    }
}

public class oops {
    public static void main(String args[]) {
        // In this we use methods to get the output
        // Pen pen1= new Pen();
        // pen1.color = "Blue";
        // pen1.type = "Gel";

        // // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.color = "Black";
        // pen2.type = "Gel";

        // pen1.pencolor();
        // pen2.pencolor();

        // By using constructors and parametrized constructors we create
        // Student s1 = new Student("Rohit", 26);
        // s1.printinfo();

        // By using Copy constructors and parametrized constructors we create
        // Student s1 = new Student();
        // s1.name = "rohit";
        // s1.age = 26;

        // // Student s2 = new Student(s1);
        // // s2.printinfo();
        // s1.printinfo(s1.name);
        // s1.printinfo(s1.age);

        // // Inheritance
        // Triangle t1 = new Triangle();
        // t1.color = "red";

        bank.Account Account1 = new bank.account();
        account1.name
    }
}
