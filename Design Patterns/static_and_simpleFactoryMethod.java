/*4
static Factory method ->

A static Factory method that returns an instance of the class, instead of using constructors (new).
public class User {
    private String name;

    private User(String name) {  // constructor is private
        this.name = name;
    }

    public static User of(String name) {
        return new User(name);
    }
}
User user = User.of("Soumyadeep");
we Normally do this-> new ArrayList<>(); instead of that also we can do ->List.of(); or List.Empty();

(In Java, we cannot have two constructors with the same name and same parameters (signature).
Instead, we often define a private constructor and provide multiple static factory methods
with meaningful names to create different types of objects.)


Simple Factory->

A Simple Factory is not an official GoF pattern, but it's a common design pattern where:
You have a separate class (the factory) that has a static method to create objects based on input.

public interface Shape {
    void draw();
}
public class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
public class Square implements Shape {
    public void draw() {
        System.out.println("Drawing Square");
    }
}
public class ShapeFactory {
    public static Shape getShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("square")) {
            return new Square();
        } else {
            throw new IllegalArgumentException("Unknown shape type: " + type);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Shape s1 = ShapeFactory.getShape("circle");
        s1.draw();

        Shape s2 = ShapeFactory.getShape("square");
        s2.draw();
    }
}

in here we put separate class for factory methods.
❌ Breaks Open/Closed Principle: You must modify ShapeFactory to add a new shape.
❌ Can get messy if you have too many types.

 */
