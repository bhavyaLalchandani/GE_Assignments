class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            balance -= amount;
            System.out.println("Debit successful. New balance: $" + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

