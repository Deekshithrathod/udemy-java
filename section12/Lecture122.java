package section12;

class Account {
    private String accountNumber;
    private String name;
    private String address;
    private String dateOfBirth;
    private double balance;

    public Account(String accountNumber, String name, String address, String dateOfBirth) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.balance = 0;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {
    private boolean hasFD = false;
    private double fdAmount = 0.0;

    public SavingsAccount(String accountNumber, String name, String address, String dateOfBirth) {
        super(accountNumber, name, address, dateOfBirth);
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    public void withdraw(double amount) {
        if (getBalance() <= getFdAmount()) {
            System.out.println("Insufficient Balance");
        } else {
            setBalance(getBalance() - amount);
        }
    }

    public double getFdAmount() {
        return fdAmount;
    }

    public void fixedDeposit(double amount) {
        setFdAmount(amount);
    }

    public void setFdAmount(double fdAmount) {
        this.fdAmount = fdAmount;
        hasFD = true;
    }

    public void liquidateFC() {
        hasFD = false;
        withdraw(fdAmount);
    }
}

public class Lecture122 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("AccountNumber", "My Name", "MyAddress", "DOB");
        System.out.println(savingsAccount.getBalance());
        savingsAccount.setBalance(1000);
        System.out.println(savingsAccount.getBalance());
    }
}
