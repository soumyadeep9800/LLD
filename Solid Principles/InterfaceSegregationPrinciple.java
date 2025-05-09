/*
Many client-specific interfaces are better than one general-purpose interface.
Keep interfaces small so that users don't end up depending on things they don't need.
Clients should not be forced to depend upon interface that they do not use.
larger interfaces should be split into smaller, more specific ones so that
clients only need to know about the methods they actually require.
Don't show your clients more than they need to see.
 */

/*
❌ Bad Example (Violates ISP)
interface Worker {
    void work();
    void eat();
}
class HumanWorker implements Worker {
    public void work() {
        System.out.println("Human working");
    }

    public void eat() {
        System.out.println("Human eating");
    }
}
class RobotWorker implements Worker {
    public void work() {
        System.out.println("Robot working");
    }

    public void eat() {
        // Not applicable for Robot
        throw new UnsupportedOperationException("Robots don't eat");
    }
}

✅ Good Example (ISP Followed)

interface Workable {
    void work();
}
interface Eatable {
    void eat();
}
class HumanWorker implements Workable, Eatable {
    public void work() {
        System.out.println("Human working");
    }

    public void eat() {
        System.out.println("Human eating");
    }
}
class RobotWorker implements Workable {
    public void work() {
        System.out.println("Robot working");
    }
}

 */

// public class InterfaceSegregationPrinciple {
    
// }
