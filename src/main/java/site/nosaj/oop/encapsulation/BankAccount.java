package site.nosaj.oop.encapsulation;

class BankAccount {
    private final String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    protected String getOwner() {
        return owner;
    }

    protected double getBalance() {
        return balance;
    }

    //behavior
    protected String deposit(double amount) {
        if (amount < 0) return "invalid amount";
        this.balance += amount;
        return "deposited " + amount + "\n"
                + "new balance: " + getBalance();
    }

    protected String withdraw(double amount) {
        if (this.balance < amount) return "not enough money";
        else {
            this.balance -= amount;
            return "withdrew " + amount + "\n"
                    + "new balance: " + getBalance();
        }

    }

    //bonus
    @Override
    public String toString() {
        return "owner: " + this.owner + ", balance: " + this.balance;
    }
}
