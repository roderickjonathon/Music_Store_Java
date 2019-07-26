import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private  String name;
    private ArrayList<ISell> stock;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addToStock(ISell stockItem){
        stock.add(stockItem);
    }

    public int getNumOfStockitems(){
        return stock.size();
    }
    public void removeFromStock(ISell stockItem){
        stock.remove(stockItem);
    }

    public int totalProfit(){
        int total = 0;
        for(ISell stockItem : stock){
            total += stockItem.calculateMarkup();
        }

        return total;
    }


}
