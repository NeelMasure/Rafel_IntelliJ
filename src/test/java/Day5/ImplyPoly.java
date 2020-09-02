package Day5;

public class ImplyPoly {

    public static void main(String[] args) {


        FedarlBank fed;

        fed = new ChaseBank();
        System.out.println("Chase Bank Rate of Interest :" + fed.getInterest());

        fed = new BOA();
        System.out.println("BOA Bank Rate of Interest :" + fed.getInterest());

    }

}
 