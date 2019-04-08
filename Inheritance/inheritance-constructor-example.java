public class HelloWorld{

     public static void main(String []args){
        Bicycle bike = new MountainBike(2,2,2);
        System.out.println("\n");
        Bicycle bike2 = new MountainBike();
        System.out.println("\n");
        Bicycle bike3 = new MountainBike(2);
     }
}
class Bicycle {
    public int gear;
    public int speed;
    
    public Bicycle() {
        gear = 0;
        speed = 0;
        System.out.println("Bicycle Default Constructor is called");
    }  
        
    // the Bicycle class has one constructor
    public Bicycle(int startSpeed, int startGear) {
        gear = startGear;
        speed = startSpeed;
        System.out.println("Bicycle Constructor with two arguements is called");
    }   
}
class MountainBike extends Bicycle {
        
    // the MountainBike subclass adds one field
    public int seatHeight;

    public MountainBike() {
        System.out.println("MountainBike Default Constructor is called");
    }  
    
    public MountainBike(int seatHt) {
        seatHeight = seatHt;
        System.out.println("MountainBike Constructor with one arguement is called");
    } 

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight,
                        int startSpeed,
                        int startGear) {
        super(startSpeed, startGear);
        seatHeight = startHeight;
        System.out.println("MountainBike Constructor with three agruements is called");
    }   
}


// Expected Output
/**
Bicycle Constructor with two arguements is called
MountainBike Constructor with three agruements is called


Bicycle Default Constructor is called
MountainBike Default Constructor is called


Bicycle Default Constructor is called
MountainBike Constructor with one arguement is called
**/
