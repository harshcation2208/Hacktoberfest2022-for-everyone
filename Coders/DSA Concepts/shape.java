import java.util.Scanner;

class Shape {
    double area;

    Shape() {
        area = 0.0;
    }
}

class Circle extends Shape {
    int a;

    Circle() {
        super();
        a = 0;
    }

    void area() {
        System.out.println("Enter radius of circle : ");
        Scanner sc_c = new Scanner(System.in);
        a = sc_c.nextInt();
        area = a * a * 3.14;
    }

    void display() {
        System.out.println("Area of Circle= " + area);
    }
}

class Rectangle extends Shape {
    int a, b;

    Rectangle() {
        super();
        a = b = 0;
    }

    void area() {
        System.out.println("Enter dimenssions of rectangle : ");
        Scanner sc_r = new Scanner(System.in);
        a = sc_r.nextInt();
        b = sc_r.nextInt();
        area = a * b;
    }

    void display() {
        System.out.println("Area of Rectangle = " + area);
    }
}

class q4 {
    public static void main(String args[]) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.area();
        r.area();
        c.display();
        r.display();
    }
}