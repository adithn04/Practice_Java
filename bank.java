public class bank {
    private String name;
    private int balance;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    private void deposit(int amount) {
        balance = balance + amount;
    }

    private void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
        }
    }

    private void display() {
        System.out.println("name: " + name);
        System.out.println("balance: " + balance);
    }

    public static void main(String[] args) {
        bank b1 = new bank();

        b1.setName("john");
        b1.setBalance(1000);

        b1.deposit(500);
        b1.withdraw(200);

        b1.display();
    }
}