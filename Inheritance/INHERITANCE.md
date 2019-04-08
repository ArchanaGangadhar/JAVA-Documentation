
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

    [Refer example here](inheritance-subclass-example.java)
