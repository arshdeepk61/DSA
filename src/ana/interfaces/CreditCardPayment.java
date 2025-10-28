package ana.interfaces;

public class CreditCardPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid: $ "+amount+ " using credit card in "+COUNTRY_NAME);
    }
}
