
## Interface

Interface is like a contract for a class which implements it. 

- Interface provides signature for the methods and fields.
- A class which implements an interface, should define all the methods declared in the interface, which are not default or static
- When a method is defined in the interface, it needs to be either default or static
- All fields and methods of the interface are public
- All fields are public static and final
- If a class which implements an interface is not defining the methods declared in the interface, then the class needs to be declared as static.

#### Difference between static and default methods in interface

- Default methods can be overriden in the classes while static methods can't.
- Static methods belongs only to the interface, so they can be only invoked through interface, not through the class which implements it.
```
public interface MyInterface {
    default void defaultMethod(){
        System.out.println("Default");
    }

    static void staticMethod(){
        System.out.println("Static");
    }    
}

public class MyClass implements MyInterface {

    public static void main(String[] args) {

        MyClass.staticMethod(); //not valid 
        MyInterface.staticMethod(); //valid
    }
}
```

#### Purpose of empty interface
 
An empty interface with no methods or fields in it is used for the purpose of defining a type.

#### Evolve an interface

An interface needs to be throughly planned before creation, since it is challenging to edit it, once it is implemented by multiple classes. However if needs arises to modify interface, it can be done as follows:

- Create a new interface out of existing interface, by inplementing exiting interface in the new interface. And the classes if they want to adapt the change, can refer\implement te new interface instead.
- If a new method needs to be added to the interface,then you can define it within the interface, as either static or default. This way, the classes implementing this interface need not have to define the new method.

#### Extending interfaces that contain default methods

When you extend an interface that contains a default method, you can do the following:

- Not mention the default method at all, which lets your extended interface inherit the default method.
- Redeclare the default method, which makes it abstract.
- Redefine the default method, which overrides it.

