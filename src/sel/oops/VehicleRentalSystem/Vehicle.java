package sel.oops.VehicleRentalSystem;

public abstract class Vehicle {

    public static String country="India";
    protected String vehicleId;
    protected  String brand;
    protected double rentalPricePerDay;

    public Vehicle(String vehicleId, String brand, double rentalPricePerDay) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    //abstract
    public abstract double calculateRentalCost(int days);

    //non-abstract
    public void displayInfo()
    {
        System.out.println("Vehicle Id: "+vehicleId);
        System.out.println("Brand: "+brand);
        System.out.println("Price/day: "+rentalPricePerDay);
    }
}
