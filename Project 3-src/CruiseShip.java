public class CruiseShip extends Ship  {
    private int MaxNumPassengers;

    //constructor
    public CruiseShip(String shipname, String year,int MaxNumPassengers) {
        super(shipname, year);
        this.MaxNumPassengers=MaxNumPassengers;

    }

    //void setPassengers
    public void setPassengers(int MaxNumPassengers) {
        this.MaxNumPassengers = MaxNumPassengers;

    }
    //get setPassengers
    public int getMaxNumPassengers() {
        return MaxNumPassengers;

    }

    public void display() {
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "\nCruise Ship\nCruise Ship Name: "+super.getShipName()+ "\nMax Number of Passengers: "+getMaxNumPassengers();

    }
}
