package instruments;

public class Saxophone extends Instrument {


    public Saxophone(String type, int costPrice, int salePrice, MakeType make, String model) {
        super(type, costPrice, salePrice, make, model);
    }

    public String play() {
        return "noot noot";
    }

}
