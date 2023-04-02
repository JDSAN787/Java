public class CellPhone {

    String model, manufacturer;
    double retailPrice;

    // Constructor
    public CellPhone(String model, String manufacturer, double retailPrice) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.retailPrice = retailPrice;
    }

    // Accessors and Mutators or getter and setter
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }
}

