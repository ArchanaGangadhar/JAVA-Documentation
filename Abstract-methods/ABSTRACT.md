
## Abstract Class
Abstract class is a class that is declared abstract.

- The **methods** in the abstract class may or may not be defined. 
- The sub-class derived from abstract class should define rest of the methods not defined in the abstract class. If not, the sub-class should also be declared as abstract.
- The **fields** in the abstract class can be either public, private or protected. And may not be static or final. Unlike the fields in interfaces, where they are always public, static and final.

### When an abstract class implements an interface
 
A class that extends interface needs to define all the methods that are defined in the interface. If the class doesn't define all the methods, then it needs to be declared as abstract, and it's subclasses needs to define rest of the interface methods.

## Abstract Method
Abstract method is a method that is declared without any implementation, as follows:

abstract void moveTo(double deltaX, double deltaY);

If a class includes absrtract methods, then the class itself needs to be declared as an abstract class.
