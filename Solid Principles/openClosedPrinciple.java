/*
Software entities (classes, modules, functions, etc.) should be open for extension,but
closed for modification.You should be able to use and add to a module without rewriting it.
 */

/*
❌ Bad Example (Violates OCP)
Every time you add a new shape,
you have to modify this method — which violates the Open/Closed Principle.

public class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.getLength() * r.getWidth();
        } else if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return Math.PI * c.getRadius() * c.getRadius();
        }
        return 0;
    }
}

✅ Good Example (OCP Applied in Java)

// Base class (closed for modification, open for extension)
public interface Shape {
    double calculateArea();
}

// Rectangle class
public class Rectangle implements Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
}
// Circle class
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
 */

// public class openClosedPrinciple {
    
// }
