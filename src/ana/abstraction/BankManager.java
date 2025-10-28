package ana.abstraction;

public class BankManager {
    public static void main(String[] args) {
        HDFCBank hdfcBank=new HDFCBank();
       hdfcBank.openAccount();
       hdfcBank.deposit();
       hdfcBank.withdraw();

       ICICIBank iciciBank=new ICICIBank();
       iciciBank.openAccount();
       iciciBank.deposit();
       iciciBank.withdraw();

    }
}
