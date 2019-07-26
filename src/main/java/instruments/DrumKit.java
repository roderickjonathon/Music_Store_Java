package instruments;

public class DrumKit extends Instrument {


    public DrumKit(String type, int costPrice, int salePrice, MakeType make, String model) {
        super(type, costPrice, salePrice, make, model);
    }

    public String play() {
        return "Deh dun dun doo";
    }

}
