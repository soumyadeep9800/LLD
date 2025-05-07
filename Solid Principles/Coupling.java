//Loose coupling in Java refers to the design principle where classes
//are independent of each other and interact through interfaces or
//abstractions rather than concrete implementations. This makes the code more flexible,
//maintainable, and testable.

// Concrete class
/*
class Lion {
    public void makeSound() {
        System.out.println("Lion roars");
    }
}
// Tightly coupled class
class Zoo {
    private Lion lion;
    public Zoo() {
        lion = new Lion();  // Direct dependency on Lion class
    }
    public void performShow() {
        lion.makeSound();   // Cannot change to another animal easily
    }
}
public class Coupling {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.performShow();
    }
}

//Refactored: Loose Coupling Using Interface
// Interface
interface Animal {
    void makeSound();
}

// Implementations
class Lion implements Animal {
    public void makeSound() {
        System.out.println("Lion roars");
    }
}

class Tiger implements Animal {
    public void makeSound() {
        System.out.println("Tiger growls");
    }
}

// Loosely coupled class
class Zoo {
    private Animal animal;

    // Dependency is injected through constructor
    public Zoo(Animal animal) {
        this.animal = animal;
    }

    public void performShow() {
        animal.makeSound();  // Works with any Animal implementation
    }
}

// Main class
public class Coupling {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Zoo zooWithLion = new Zoo(lion);
        zooWithLion.performShow();  // Output: Lion roars

        Animal tiger = new Tiger();
        Zoo zooWithTiger = new Zoo(tiger);
        zooWithTiger.performShow();  // Output: Tiger growls
    }
}
*/
