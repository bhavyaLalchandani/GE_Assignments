public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account(500);
        acc.debit(600); // Exceed balance
        acc.debit(300); // Valid transaction
    }
}
