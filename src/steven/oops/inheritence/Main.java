package steven.oops.inheritence;

public class Main {
    public static void main(String[] args) {
        Address address=new Address("Toronto","Canada");
        Employee emp=new Employee("Karan",address);
        //emp.showInfo();
        System.out.println(emp);
    }
}
