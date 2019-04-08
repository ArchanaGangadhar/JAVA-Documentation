class MountainBike extends Bicycle {
    public void printDescription() {
        super.printDescription();
        System.out.println("MountainBike print description");
    }
} 
class RoadBike extends Bicycle{
    public void printDescription(){
        super.printDescription();
       System.out.println("RoadBike print description");
    }
}
class Bicycle{
    public void printDescription(){
        System.out.println("Bicycle print description");
    }
}
public class TestBikes {
  public static void main(String[] args){
    Bicycle bike01, bike02, bike03;

    bike01 = new Bicycle();
    bike02 = new MountainBike();
    bike03 = new RoadBike();

    bike01.printDescription();
    System.out.println("\n");
    bike02.printDescription();
    System.out.println("\n");
    bike03.printDescription();
  }
}

/* Expected Output
Bicycle print description


Bicycle print description
MountainBike print description


Bicycle print description
RoadBike print description

*/
