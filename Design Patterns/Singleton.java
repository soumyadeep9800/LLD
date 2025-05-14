//1    1-5(creational design)
//The Singleton Design Pattern ensures that only one instance of a class is created
//throughout the application, and it provides a global access point to that instance.

/*
Eager Initialization Singleton
public class Singleton {
    // Instance is created when the class is loaded
    private static final Singleton instance = new Singleton();

    private Singleton() {
        // private constructor
    }

    public static Singleton getInstance() {
        return instance;
    }
}
The object is created even if it's never used — not memory efficient.

🧱 Basic Structure (Lazy Initialization - Thread Unsafe)
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // instance created lazily
        }
        return instance;
    }
}
This is not thread-safe. Two threads can create multiple instances in race conditions.

✅ Thread-Safe Singleton (Double-Checked Locking)
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

✅ Easiest & Best (Bill Pugh Singleton - using static inner class)
public class Singleton {

    private Singleton() {}

    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
Thread-safe,Lazy-loaded,No synchronization overhead

✅ Java Enum Singleton (Most robust way)
public enum Singleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("Doing something");
    }
}
Enum singletons are thread-safe, serialization-safe, and reflection-safe.

 */
// public class Singleton {
// }
