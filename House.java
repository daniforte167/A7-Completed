/* This is a stub for the House class */
import java.util.ArrayList;
public class House extends Building {
  ArrayList<String> Residents;
  boolean hasDiningRoom;
  boolean isResident;

  public House(String name, String address, int nFloors, boolean hasDR) {
    super(name, address, nFloors);
    hasDR = hasDiningRoom;
    this.Residents = new ArrayList<String>() ;

    System.out.println("You have built a house: 🏠");
  }
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }
  public int nResidents(){
    return this.Residents.size();

  }
  public void moveIn(String name){
    //adding a String of the name
    Residents.add(name);
    //adding a name to the list
  }
  

  public String moveOut(String name){
    //removing a name
    Residents.remove(name);
    return name;

  }

  public boolean isResident(String person){
    //checking if the Resident is in the house
    return Residents.contains(person);
  }
    //returns the name of the person
    //asking if resident is a real person within the list

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

    public String toString() {
      return this.name + " is a " + this.nFloors + "-story Smith College House located at " + this.address + ".";
  }
//changes it so it reflects what kind of building it is

    public void showOptions() {
      super.showOptions();
      System.out.println("Available options at " + this.name + ":\n + moveIn() \n + moveOut() \n + isResident()");
  }


  public static void main(String[] args) {
    House Wilder = new House("Wilder",  "1 Mandelle Road", 4, true);
    Wilder.Residents.add("Dani");;
    Wilder.Residents.add("Jillian");
    Wilder.isResident("Dani");
    Wilder.Residents.size();
    Wilder.showOptions();
    System.out.println(Wilder.hasDiningRoom);
    System.out.println(Wilder);
    System.out.println(Wilder.Residents);
  }

}