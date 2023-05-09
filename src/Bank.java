public class Bank {
    private int balance;
    private String ownerName;

    public Bank(int balance, String ownerName) {
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public Bank() {
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Balance: " + balance + "\n" +
                "Owner name: " + ownerName + "\n";
    }
}
