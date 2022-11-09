/* This is the Cafe class */
public class Cafe extends Building{

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
    
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
        

    }

    public Cafe (int nFLoors){
        this.nFloors = nFloors;
      }
  
      public Cafe(String address) {
        this.address = address;
      }
  
    


    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        this.nCoffeeOunces = this.nCoffeeOunces - nCoffeeOunces;
         this.nCreams = this.nCreams - nCreams;
         this.nSugarPackets = this.nSugarPackets - nSugarPackets;
         //the this is what you have
        System.out.println("You have " + this.nCoffeeOunces + " ounces of coffee!");
        System.out.println("You have " + this.nCreams + " creams!");
        System.out.println("You have " + this.nSugarPackets + " sugar packets!"); 

    }
    public void showOptions() {
        super.showOptions();
        System.out.println("Available options at " + this.name + ":\n + sellCoffee()");
    }

    public String toString() {
        return this.name + " is a " + this.nFloors + "-story cafe located at " + this.address + ".";
    }
    //this changes it so anything using this code is registered as a house

    public Building enter() {
        if (activeFloor != -1) {
            throw new RuntimeException("You are already inside this cafe.");
        }
        this.activeFloor = 1;
        System.out.println("You are now inside " + this.name + " on the ground floor.");
        return this; // Return a pointer to the current building
    }

    public static void main(String[] args) {
        Cafe Compass = new Cafe("Compass", "7 Neilson Drive, Northampton, Ma, 01063", 1);
        Compass.nCoffeeOunces = 8;
        Compass.nSugarPackets = 9;
        Compass.nCreams = 6;
        Compass.nCups = 2;
        //this stores how many you want to sell of the things
        Compass.sellCoffee(4, 3, 2);
        Compass.showOptions();
        System.out.println(Compass);
  
    
}
}
