public class HelloWorld{

     public static void main(String []args){
        Bicycle bike = new MountainBike();
        bike.accelerate();  //MountainBike accelerate is called
        bike.deccelerate(); //Bicycle deccelerate is called
        
        System.out.println(bike.color);
        // System.out.println(bike.styleNum);  ///gives an error since private
        
         System.out.println("\n");
        
        MountainBike bike2 = new MountainBike();
        bike2.accelerate();  //MountainBike accelerate is called
        bike2.deccelerate(); //MountainBike deccelerate is called
        
        System.out.println(bike2.color);
        // System.out.println(bike2.styleNum); ///gives an error since private
        
     }
}
class Bicycle {
    public int gear;
    public int speed;
    
    protected int color = 0;
    private int styleNum = 120;
    
    public void accelerate()
    {
        System.out.println("Bicycle accelerate method is called");
    }
    
    public static void deccelerate()
    {
        System.out.println("Bicycle deccelerate method is called");
    }
    
    public void changeGear()
    {
        System.out.println("Bicycle changeGear method is called");
    }
    
}
class MountainBike extends Bicycle {
        
    // the MountainBike subclass adds one field
    public int seatHeight;

    public void accelerate()
    {
        System.out.println("MountainBike accelerate method is called");
    }
    
    public static void deccelerate()
    {
        System.out.println("MountainBike deccelerate method is called");
    }
    
    //Subclasses method cannot be static, if the parent class method is not static. Hence the below code will give compiler error
    /*
     public static void changeGear()
    {
        System.out.println("MountainBike changeGear method is called");
    }
    */ 
}
