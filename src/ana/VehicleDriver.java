package ana;

public class VehicleDriver {

    public static void main(String[] args) {
        Vehicle car=new Vehicle();
        car.setBrand("Toyoto");
        car.setType("Top Model");
        car.setPrice(18967.98);

        Vehicle car1=new Vehicle();
        car1.setBrand("Maruti");
        car1.setType("Top Model");
        car1.setPrice(288967.98);

        System.out.println("Vehicle 1: brand: "+car.getBrand()+ " type: "+car.getType()
        +" price: "+car.getPrice());
    }
}
