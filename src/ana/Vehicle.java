package ana;

public class Vehicle {
    //ENCAPSULATION- Binding the data and methods into a single unit
    //By restricting access to the internal state of object
    private String type;
    private String brand;
    private double price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
