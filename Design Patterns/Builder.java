/* 3
The Builder Design Pattern in Java is a creational design pattern used to build
complex objects step by step, especially when constructors have too many
parameters (required + optional). It improves readability, flexibility,
and helps avoid telescoping constructor problems.
 */

/*
public class Car {
    private String engine;
    private int wheels;
    private boolean sunroof;
    // Private constructor
    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.sunroof = builder.sunroof;
    }
    // Static nested Builder class
    public static class CarBuilder {
        private String engine;   // required
        private int wheels = 4;  // optional with default
        private boolean sunroof = false; // optional with default
        public CarBuilder(String engine) {
            this.engine = engine;
        }
        public CarBuilder wheels(int wheels) {
            this.wheels = wheels;
            return this;
        }
        public CarBuilder sunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }
        public Car build() {
            return new Car(this);
        }
    }
    public void showCar() {
        System.out.println("Engine: " + engine + ", Wheels: " + wheels + ", Sunroof: " + sunroof);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder("V8 Engine")
                        .wheels(6)
                        .sunroof(true)
                        .build();

        car.showCar();
    }
}

Advantages:
Clean and readable object creation.
No need to remember constructor parameter order.
Easily extendable.
Immutable object can be created (by making fields final).
*/













// public class Builder {
    
// }
