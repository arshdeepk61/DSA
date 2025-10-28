package ana.interfaces;

public class PaymentDemo {
    public static void main(String[] args) {
        Payment creditCard=new CreditCardPayment();
        creditCard.makePayment(500);

        Payment cashPayment=new CashPayment();
        cashPayment.makePayment(1000);
    }
}
