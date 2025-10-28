package steven.oops.inheritence;

public class Employee {
    private String name;
    private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name +" lives in "+address.getCity()+", "+address.getCountry();
    }

    /*    public void showInfo(){
        System.out.println(name +" lives in "+address.getCity()+", "+address.getCountry());
    }*/
}
