import java.util.ArrayList;
import java.util.List;

class Stock {
    String name;
    int shares;
    double price;

    public Stock(String name, int shares, double price) {
        this.name = name;
        this.shares = shares;
        this.price = price;
    }

    public double getValue() {
        return shares * price;
    }
}

class StockPortfolio {
    List<Stock> stocks = new ArrayList<>();

    public void addStock(String name, int shares, double price) {
        stocks.add(new Stock(name, shares, price));
    }

    public void printReport() {
        double totalValue = 0;
        System.out.println("Stock Report:");
        for (Stock stock : stocks) {
            double value = stock.getValue();
            System.out.println("Stock: " + stock.name + ", Value: $" + value);
            totalValue += value;
        }
        System.out.println("Total Portfolio Value: $" + totalValue);
    }
}

public class StockAccountManagement {
    public static void main(String[] args) {
        StockPortfolio portfolio = new StockPortfolio();
        portfolio.addStock("Apple", 10, 150);
        portfolio.addStock("Google", 5, 2800);
        portfolio.addStock("Amazon", 3, 3500);
        portfolio.printReport();
    }
}
