public class MainClass{
     public static void main(String... args) {
        Mustang myApp = new Mustang();
        System.out.println(myApp.identifyMyself()); // I am a horse.
        
        System.out.println('\n'); 
        
        StarCar fCar =  new StarCar();
        fCar.startEngine(2);
        
        System.out.println('\n'); 
        
        Dragon dragon = new Dragon();
        System.out.println(dragon.identifyMyself());
    }
}

interface Mammal {
    static String identifyMyself(){
        return "I am a mammal.";
    }
}
class Horse {
    public String identifyMyself() {
        return "I am a horse.";
    }
}
class Mustang extends Horse implements Mammal {}

interface OperateCar {
    default public void startEngine(int key) {
        System.out.println("OperateCar startEngine");
    }
}
interface FlyCar {
    default public void startEngine(int key) {
         System.out.println("FlyCar startEngine");
    }
}
class StarCar implements OperateCar, FlyCar {
    public void startEngine(int key) {
        System.out.println("StarCar startEngine");
        FlyCar.super.startEngine(key);
        OperateCar.super.startEngine(key);
    }
}

interface Animal {
    default public String identifyMyself() {
        return "I am an animal.";
    }
}
interface EggLayer extends Animal {
    default public String identifyMyself() {
        return "I am able to lay eggs.";
    }
}
interface FireBreather extends Animal { }
class Dragon implements EggLayer, FireBreather {}


/* Expected Output
I am a horse.


StarCar startEngine
FlyCar startEngine
OperateCar startEngine


I am able to lay eggs.
*/
