// Interface
interface Shape {
    void display();
}

// Abstract Class
abstract class AbstractShape {
    abstract void calculateArea();
    
    public void showInfo() {
        System.out.println("This is an abstract class with a concrete method.");
    }
}

// Final Class
final class Circle extends AbstractShape implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the Circle: " + area);
    }

    @Override
    public void display() {
        System.out.println("This is a Circle.");
    }
}

public class InterfaceOfCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.display();
        circle.calculateArea();
        circle.showInfo();
    }
}
