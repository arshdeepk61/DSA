package sel.oops.VehicleRentalSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RentalService {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ArrayList<Vehicle> vehicles=new ArrayList<>();
        vehicles.add(new Car("C101","Toyota",1000,7));
        vehicles.add(new Bike("B201","Honda",500,true,
                Arrays.asList(10,20,33,100)));

        for(Vehicle v:vehicles)
        {
            v.displayInfo();
            System.out.println("Enter rental days: ");
            int days=scanner.nextInt();
            double cost=v.calculateRentalCost(days);
            System.out.println("Total rental cost: $ "+cost);
            System.out.println("------------------");
        }
        scanner.close();
    }
}
