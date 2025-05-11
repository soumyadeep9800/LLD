/*2
The Cascading Pattern in Java refers to method chaining, where methods return this
(current object)so that multiple method calls can be chained together in a single statement.
 */

/*
public class Person {
    private String name;
    private int age;

    public Person setName(String name) {
        this.name = name;
        return this; // returning the current object
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Alice")
        .setAge(25)
        .showInfo(); // Output: Name: Alice, Age: 25
    }
}

Benefits:Fluent and readable code,Cleaner object configuration,
Common in libraries like Hibernate, Spring, and builder-based APIs

Real-world Java examples:StringBuilder.append().reverse().toString()
                        :Stream.filter().map().collect()
 */














// public class Cascading {
    
// }
