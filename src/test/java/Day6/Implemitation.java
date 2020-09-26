package Day6;

public class Implemitation {

    public static void main(String[] args) {

        Banking bank = new Banking();
        bank.setName("Neel");
        String nm = bank.getName();
        System.out.println("Name= "+nm);
        bank.setCc(545624515l);
        long cc = bank.getCc();
        System.out.println("CC= "+cc);
        bank.setPin(12456);
        System.out.println("Pin= "+bank.getPin());

    }

}


