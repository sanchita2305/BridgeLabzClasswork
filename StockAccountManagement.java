package PracticeQuestions.StockAccountManagement;
import java.util.Scanner;
public class StockAccountManagement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of stocks:");
        int n=sc.nextInt();
        StockPortfolio stockPortfolio=new StockPortfolio();

        for(int i=0;i<n;i++){
            System.out.println("enter details for stock "+(i+1)+":");
            System.out.println("Stock Name: ");
            String stockName=sc.next();
            System.out.println("Number of shares: ");
            int numberOfShares=sc.nextInt();
            System.out.println("Share Price: $");
            double sharePrice=sc.nextDouble();

            Stock stock=new Stock(stockName,numberOfShares,sharePrice);
            stockPortfolio.addStock(stock);
        }
        stockPortfolio.printStockReport();
    }
}
