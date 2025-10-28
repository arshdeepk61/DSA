package sel.oops.VehicleRentalSystem;

import java.util.List;

public class Bike extends Vehicle{
    private boolean helmetIncluded;
    private List<Integer> historicalPrices;

    public Bike(String vehicleId, String brand, double rentalPricePerDay,boolean helmetIncluded,
                List<Integer> historicalPrices) {
        super(vehicleId, brand, rentalPricePerDay);
        this.helmetIncluded=helmetIncluded;
        this.historicalPrices=historicalPrices;
    }

    @Override
    public double calculateRentalCost(int days) {
        double extraCharge= helmetIncluded?50*days:0;
        return (rentalPricePerDay *days)+extraCharge;
    }

    public List<Integer> getHistoricalPrices() {
        return historicalPrices;
    }
}
