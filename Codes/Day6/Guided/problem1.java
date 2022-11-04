package Day6.Guided;

public class problem1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(30.3,45.4);
        r1.getArea(); r1.printDetails(); System.out.println();
        Circle c1 = new Circle(23.2);
        c1.getArea(); c1.printDetails(); System.out.println();
        Triangle t1 = new Triangle(146.2,40.0);
        t1.getArea(); t1.printDetails(); System.out.println();


    }
}



abstract class Shape{
    abstract double getArea();
    abstract void printDetails();
}

class Rectangle extends Shape{

    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double getArea() {
        return this.length*this.breadth;
    }

    @Override
    void printDetails() {
        System.out.println("Type = Rectangle");
        System.out.println("Length = "+length);
        System.out.println("Breadth = "+breadth);
        System.out.println("Area = "+getArea());
    }
}

class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return (3.14)*this.radius*this.radius;
    }

    @Override
    void printDetails() {
        System.out.println("Type = Circle");
        System.out.println("Radius = "+radius);
        System.out.println("Area = "+getArea());
    }
}

class Triangle extends Shape{
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double getArea() {
        return (0.5)*this.base*this.height;
    }

    @Override
    void printDetails() {
        System.out.println("Type = Triangle");
        System.out.println("Base = "+base);
        System.out.println("Height = "+height);
        System.out.println("Area = "+getArea());
    }
}