package Day5;

public class Kar extends MinofTrans implements GreenTribunal,MinofIndus{


    @Override
    public void pollutionLevel() {
        System.out.println("Pollution Level");
    }

    @Override
    public void waterpollution() {
        System.out.println("Water Pollution Level");


    }

    public static void main(String[] args) {
        Kar k = new Kar();
        k.pollutionLevel();
        k.waterpollution();
        k.noisePoll();
        k.MSME();
        k.railways();
        k.tramp();
    }


    @Override
    public void MSME() {
        System.out.println("Kar indus coridor");


    }

    @Override
    void tramp() {
        System.out.println("Tramps");
    }

    @Override
    void railways() {
        System.out.println("Railways");

    }
}

