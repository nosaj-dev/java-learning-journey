package site.nosaj.oop.encapsulation;

class BankAccount {
   private String owner;
   private double balance;

   public BankAccount(String owner, double balance) {
       setBalance(balance);
       setOwner(owner);
   }
    protected String getOwner() {
        return owner;
    }

    private void setOwner(String owner) {
        this.owner = owner;
    }

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    //behavior
    protected String deposit(double amount) {
        setBalance(getBalance() + amount);
        return "deposited " + amount + "\n"
                + "new balance: " + getBalance();
    }
    protected String withdraw(double amount) {
       if(getBalance() < amount) return "not enough money";
       else {
           setBalance(getBalance() - amount);
           return "withdrew " + amount + "\n"
                   + "new balance: " + getBalance();
       }

    }

    //bonus
    @Override
    public String toString() {
        return "owner: " + getOwner() + ", balance: " + getBalance();
    }
}
