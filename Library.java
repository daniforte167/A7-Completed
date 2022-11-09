/* This is a stub for the Library class */
import java.util.Hashtable;


import java.lang.Override;

public class Library extends Building {
  Hashtable<String, Boolean> collection;
  //creates hashtable for use 

    protected String name;
    protected String address;
    protected int nFloors;
    protected int activeFloor = -1; // Default value indicating we are not inside this building
    private boolean hasElevator;
 


  public Library(String name, String address, int nFloors) {
   super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean> ();
    //  initialize it
      collection.put("Horton Hears a Who by Doctor Suess", true);
      collection.put("The Girl at Midnight by Melissa Grey", true);
      collection.put("Scapegracers by H.A. Clarke", true);      
      System.out.println("You have built a library: 📖");

    }     
    

    public void goToFloor (double nFLoors, boolean hasElevator){
      if (hasElevator == true){
        if (nFloors > 1){
          System.out.println("You are riding the elevator.");
        }
        else {
          throw new RuntimeException("Invalid floor number. Valid range for this Building is 1-" + this.nFloors +".");
        }

      }
//trying to say if there's an elevator and they 
//try to put in a number more than 1, then it should prompt
//to print there's an elevator, else it'll throw a runtime exception
    }
    //overloading the nFloors so it involves Library




    @Override
    //overriding the gotofloor with new code that asks about elevator
     public void goToFloor(int floorNum){
      if (this.activeFloor == -1) {
        throw new RuntimeException("You are not inside this Building. Must call enter() before navigating between floors.");
    }
    if (floorNum < 1 || floorNum > this.nFloors) {
        throw new RuntimeException("Invalid floor number. Valid range for this Building is 1-" + this.nFloors +".");
    }
    boolean hasElevator;
    hasElevator = true;
    if (hasElevator == true || floorNum > this.nFloors);
    System.out.println("You are now on floor #" + floorNum + " of " + this.name);
    this.activeFloor = floorNum;
    
    }


    private void put(String title){
      collection.put(title, true);
      //unclear why put is squiggly underlined, but it runs otherwise
    
    }



    public String remove(String title){
      collection.remove(title);
      return title;

    }
    // return the title that we removed


    public boolean checkOut(String title){
      return false;

    }

    public boolean returns(String title){
      return true;
    }



  
public boolean containsTitle(String title){
  return true;

} 
// returns true if the title appears as a key in the Libary's collection, false otherwise

public boolean isAvailable(String title){
  return true;
  
 }
 // returns true if the title is currently available, false otherwise

 public void printCollection(){
}

public String toString() {
  return this.name + " is a " + this.nFloors + "-story library located at " + this.address + ".";
}
//anything using this code will be a library 

public void showOptions(){
  super.showOptions();
  System.out.println("Available options at " + this.name + ":\n + put() \n + remove() \n + checkOut() \n + returns()\n + containsTitle()\n + isAvailable()");
}
 // prints out the entire collection in an easy-to-read way (including checkout status)

    public static void main(String[] args) {
      Library Neilson = new Library("Neilson", "7 Neilson Drive, Northampton, MA, 01063", 4);
      Neilson.collection.put("When We Were Magic by Sarah Gailey", true);
      Neilson.collection.remove("Horton Hears a Who by Doctor Suess");
      Neilson.isAvailable("Scapegracers by H.A. Clarke");
      System.out.println(Neilson.collection);
      System.out.println(Neilson);
      Neilson.showOptions();
    }
  }