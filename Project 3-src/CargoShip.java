public class CargoShip extends Ship{
    private int tonnage;

    // construtor
    public CargoShip(String name,String year,int tonnage) {
        super(name,year);
        this.tonnage=tonnage;
    }
    //void set tonnage
    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }
    //return tonnage
    public int getTonnage() {
        return tonnage;
    }
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "\nCargo Ship\nShip Name: "+getShipName()+"\nShip Tonnage Capacity: "+getTonnage();
    }

}


