package saleItems;

import behaviours.ISell;

public abstract class SaleItem implements ISell {

    private String type;
    private int costPrice;
    private int salePrice;

    public SaleItem(String type, int costPrice, int salePrice){
        this.type = type;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public int calculateMarkup(){
        return this.salePrice - this.costPrice;
    }


}


