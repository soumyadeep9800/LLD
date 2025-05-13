/*5
Factory Method->
The Factory Method Pattern lets subclasses decide which class to instantiate.
It uses inheritance and polymorphism to delegate the object creation task to child classes

interface AnimalFactory {
    Animal getAnimal();
}
class DogFactory implements AnimalFactory{
    public Animal getAnimal(){
        return new Dog();
    }
}
class CatFactory implements AnimalFactory{
    public Animal getAnimal(){
        return new Cat();
    }
}
AnimalFactory dogFactory=new DogFactory();
Animal dog=dogFactory.getAnimal();


Abstract Factory->

Abstract Factory is a creational design pattern that provides an interface for
creating families of related or dependent objects without specifying their concrete classes

interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

*/
