public abstract class BankAccount {
    private int accno;

    private String name;

    private String acc_type;
    protected double balance;

    //Constructor
    public BankAccount() {

    }

    public BankAccount(int accno) {
        this.accno = accno;
        balance = 0;
    }

    //Getter
    public double getBalance() {
        return this.balance;
    }

    public int getAccno() {
        return this.accno;
    }

    //Abstract
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public void showAccount() {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + accno);
        System.out.println("Account type: " + acc_type);
        System.out.println("Balance: " + balance);
    }

}



