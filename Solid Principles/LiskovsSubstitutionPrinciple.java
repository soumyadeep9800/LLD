/*
"Objects of a superclass should be replaceable with objects of its
subclasses without breaking the application."
 */

/*
❌ Bad Example (LSP Violation)
class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}
class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly!");
    }
}

✅ Good Example (LSP Followed)

class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}
class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
public class LSPDemo {
    public static void makeBirdFly(Bird bird) {
        bird.fly();  // Works with any subclass of Bird
    }
    public static void main(String[] args) {
        Bird b = new Sparrow();  // Subclass replaces superclass
        makeBirdFly(b);          // No issue, LSP is satisfied
    }
}
 */






// public class LiskovsSubstitutionPrinciple {

// }
