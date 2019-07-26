package instruments;

import behaviours.IPlay;
import saleItems.SaleItem;

public abstract class Instrument extends SaleItem implements IPlay {
    private MakeType make;
    private String model;


    public Instrument(String type, int costPrice, int salePrice, MakeType make, String model) {
        super(type, costPrice, salePrice);
        this.make = make;
        this.model = model;
    }


    public MakeType getMake() {
        return make;
    }

    public void setMake(MakeType make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



}