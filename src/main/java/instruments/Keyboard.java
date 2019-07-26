package instruments;

public class Keyboard extends Instrument {


    public Keyboard(String type, int costPrice, int salePrice, MakeType make, String model) {
        super(type, costPrice, salePrice, make, model);
    }

    public String play() {
        return "Plink plonk";
    }

}
