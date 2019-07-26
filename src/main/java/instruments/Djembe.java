package instruments;

public class Djembe extends Instrument {


    public Djembe(String type, int costPrice, int salePrice, MakeType make, String model) {
        super(type, costPrice, salePrice, make, model);
    }

    public String play() {
        return "Doof Doof";
    }

}
