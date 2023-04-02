public abstract class Ship implements Displayable {
    //name and year fields
    private String shipname;
    private String year;

    //constructor for ship name and year
    public Ship(String shipname, String year) {
        super();
        this.shipname = shipname;
        this.year = year;
    }
    //get Ship
    public String getShipName() {
        return shipname;
    }

    //get Year
    public String getYear() {
        return year;
    }

    //set name and year void
    public void setShipname(String Shipname){
        this.shipname = shipname;
    }
    public void setYear(String year) {
        this.year = year;
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "\nShip\nShip Name: "+getShipName()+ "\nYear: "+getYear();

    }

}
