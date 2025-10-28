package sel.oops.VehicleRentalSystem;

public class Car extends Vehicle{
    private int seatingCapacity;

    public Car(String vehicleId, String brand, double rentalPricePerDay,int seatingCapacity) {
        super(vehicleId, brand, rentalPricePerDay);
        this.seatingCapacity=seatingCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        double extraCharge= (seatingCapacity>5)?200*days:0;
        return (rentalPricePerDay * days)+extraCharge;
    }
}
