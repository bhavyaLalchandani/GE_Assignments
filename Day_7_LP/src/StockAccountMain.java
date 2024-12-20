import java.util.*;

class CompanyShares {
    String symbol;
    int shares;
    Date date;

    public CompanyShares(String symbol, int shares) {
        this.symbol = symbol;
        this.shares = shares;
        this.date = new Date();
    }
}

class StockAccount {
    List<CompanyShares> sharesList = new ArrayList<>();
    double balance = 10000;

    public void buy(int amount, String symbol) {
        if (balance >= amount) {
            sharesList.add(new CompanyShares(symbol, amount / 100));
            balance -= amount;
            System.out.println("Bought shares of " + symbol);
        } else {
            System.out.println("Insufficient balance to buy shares.");
        }
    }

    public void sell(int amount, String symbol) {
        for (CompanyShares shares : sharesList) {
            if (shares.symbol.equals(symbol) && shares.shares >= amount / 100) {
                shares.shares -= amount / 100;
                balance += amount;
                System.out.println("Sold shares of " + symbol);
                return;
            }
        }
        System.out.println("Shares not available to sell.");
    }

    public void printReport() {
        System.out.println("Account Balance: $" + balance);
        System.out.println("Stock Holdings:");
        for (CompanyShares shares : sharesList) {
            System.out.println("Symbol: " + shares.symbol + ", Shares: " + shares.shares);
        }
    }
}

public class StockAccountMain {
    public static void main(String[] args) {
        StockAccount account = new StockAccount();
        account.buy(1000, "AAPL");
        account.sell(500, "AAPL");
        account.printReport();
    }
}

