class BankAccount {
    double getInterestRate() {
        return 0.0;
    }
}

class SavingAccount extends BankAccount {
    @Override
    double getInterestRate() {
        return 4.5;
    }
}

class CurrentAccount extends BankAccount {
    @Override
    double getInterestRate() {
        return 3.0;
    }
}

public class Test {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingAccount();
        BankAccount acc2 = new CurrentAccount();

        System.out.println("Saving Account Interest Rate: " + acc1.getInterestRate());
        System.out.println("Current Account Interest Rate: " + acc2.getInterestRate());
    }
}
