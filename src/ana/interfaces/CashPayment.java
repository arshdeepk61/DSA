package ana.interfaces;

public class CashPayment implements Payment{
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid: $ "+amount+" using cash in "+COUNTRY_NAME);
    }
}
