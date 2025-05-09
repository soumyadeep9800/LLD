/*
High-level modules should not depend on low-level modules. Both should depend on abstractions."
Abstractions should not depend on details. Details should depend on abstractions.
 */
/*
❌ Bad Example (Violates DIP)
class MySQLDatabase {
    public void connect() {
        System.out.println("Connected to MySQL");
    }
}
class Application {
    private MySQLDatabase db;
    public Application() {
        db = new MySQLDatabase();  // Tight coupling
    }
    public void start() {
        db.connect();
    }
}
✅ Good Example (Follows DIP)
// Abstraction
interface Database {
    void connect();
}
// Low-level modules
class MySQLDatabase implements Database {
    public void connect() {
        System.out.println("Connected to MySQL");
    }
}
class MongoDBDatabase implements Database {
    public void connect() {
        System.out.println("Connected to MongoDB");
    }
}
// High-level module
class Application {
    private Database db;

    // Dependency injected through constructor
    public Application(Database db) {
        this.db = db;
    }

    public void start() {
        db.connect();
    }
}
 */


// public class DependencyInversionPrinciple {
    
// }
