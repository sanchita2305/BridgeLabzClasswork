package PracticeQuestions.StockAccountManagement;

import java.util.ArrayList;

public class StockPortfolio {
    ArrayList<Stock> stocks;
    public StockPortfolio(){
        stocks=new ArrayList<>();
    }
    public void addStock(Stock stock){
        stocks.add(stock);
    }
    public double calculateTotalValue(){
        double totalValue=0;
        for(Stock stock:stocks){
            totalValue+=stock.calculateStockValue();
        }
        return totalValue;
    }
    public void printStockReport(){
        System.out.println("Stock Report");
        for(Stock stock:stocks){
            System.out.println("Stock: "+stock.stockName+", Number of Shares: "+stock.numberOfShares+", Share Price: "+stock.sharePrice+", Total Value: "+stock.calculateStockValue());
        }
        System.out.println("Total portfolio Value: $"+calculateTotalValue());
    }
}
