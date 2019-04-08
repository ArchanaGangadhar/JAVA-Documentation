
## Inheritance

When a class inherits from the parent class, it inherits parent classes' states and behavior, i.e. it's fields and methods.

- A class can inherit from only one class, whereas it can implement multiple interface.
```
    class TestClass extends SuperClass implements Interface1, Interface2{}
```
  
- Subclass inherits all the public and protected members from parent class, no matter which package the subclass is in.

- Constructor is not inherited, however constructor of the parent class can be called as follows:
```
public class Bicycle {
    public int gear;
    public int speed;
        
    // the Bicycle class has one constructor
    public Bicycle(int startSpeed, int startGear) {
        gear = startGear;
        speed = startSpeed;
    }   
}
public class MountainBike extends Bicycle {
        
    // the MountainBike subclass adds one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight,
                        int startSpeed,
                        int startGear) {
        super(startSpeed, startGear);
        seatHeight = startHeight;
    }   
}
```

- If parent class constructor is not called in subclass's constructor, the default constructor of Parent class is called in the subclass's constructor.

    [Refer example here](inheritance-constructor-example.java)
    
 
 #### What can you do in a subclass

- The inherited fields can be used directly, just like any other fields.
- You can declare a field in the subclass with the same name as the one in the superclass, thus hiding it (not recommended).
- You can declare new fields in the subclass that are not in the superclass.
- The inherited methods can be used directly as they are.
- You can write a new instance method in the subclass that has the same signature as the one in the superclass, thus overriding it.
- You can write a new static method in the subclass that has the same signature as the one in the superclass, thus hiding it.
- You can declare new methods in the subclass that are not in the superclass.
- You can write a subclass constructor that invokes the constructor of the superclass, either implicitly or by using the keyword super.
- Subclasses method cannot be static, if the parent class method is not static.
- Subclass doesnt inherit private memeber of the parent class.

    [Refer example here](inheritance-subclass-example.java)
    
#### The distinction between hiding a static method and overriding an instance method has important implications:

- The version of the overridden instance method that gets invoked is the one in the subclass.
- The version of the hidden static method that gets invoked depends on whether it is invoked from the superclass or the subclass.
    
 #### Casting Objects
 
We have seen that an object is of the data type of the class from which it was instantiated. For example, if we write
```
public MountainBike myBike = new MountainBike();
```
then myBike is of type MountainBike.

MountainBike is descended from Bicycle and Object. Therefore, a MountainBike is a Bicycle and is also an Object, and it can be used wherever Bicycle or Object objects are called for.

The reverse is not necessarily true: a Bicycle may be a MountainBike, but it isn't necessarily. Similarly, an Object may be a Bicycle or a MountainBike, but it isn't necessarily.

Casting shows the use of an object of one type in place of another type, among the objects permitted by inheritance and implementations. For example, if we write
```
Object obj = new MountainBike();
```
then obj is both an Object and a MountainBike (until such time as obj is assigned another object that is not a MountainBike). This is called implicit casting.

If, on the other hand, we write
```
MountainBike myBike = obj;
```
we would get a compile-time error because obj is not known to the compiler to be a MountainBike. However, we can tell the compiler that we promise to assign a MountainBike to obj by explicit casting:
```
MountainBike myBike = (MountainBike)obj;
```
This cast inserts a runtime check that obj is assigned a MountainBike so that the compiler can safely assume that obj is a MountainBike. If obj is not a MountainBike at runtime, an exception will be thrown.

#### Poymorphism (Virtual Method Invocation)

[Refer the example here](polymorphism.java)
