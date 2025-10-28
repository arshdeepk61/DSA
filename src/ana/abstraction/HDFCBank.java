package ana.abstraction;

public class HDFCBank extends Bank{
    @Override
    void deposit() {
        System.out.println("Depositing money in HDFC in"+COUNTRY_NAME);
        System.out.println("I can change the country: "+CHANGING_COUNTRY);
        CHANGING_COUNTRY="India";
        System.out.println("Country is changed "+CHANGING_COUNTRY);
    }

    @Override
    void withdraw() {
        System.out.println("Withdrawing money from HDFC");
    }
}
