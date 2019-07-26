package instruments;

public class Synthesiser extends Instrument {


    public Synthesiser(String type, int costPrice, int salePrice, MakeType make, String model) {
        super(type, costPrice, salePrice, make, model);
    }

    public String play() {
        return "Spacey noises";
    }


}
