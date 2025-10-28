package ana.abstraction;

public class ICICIBank extends Bank{
    @Override
    void deposit() {
        System.out.println("Depositing money in ICICI");
    }

    @Override
    void withdraw() {
        System.out.println("Withdrawing money from ICICI");
    }
}
