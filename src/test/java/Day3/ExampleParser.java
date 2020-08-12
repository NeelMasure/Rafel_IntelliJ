package Day3;

public class ExampleParser {


    public static void main(String[] args) {

        String flipKart = "₹56,490";
        String amzon = "₹63,300";

        int amz = Integer.parseInt(amzon.replace("₹","").replace(",",""));
        int flp = Integer.parseInt(flipKart.replace("₹","").replace(",",""));


        if(amz>flp){
            System.out.println("Amazon is expensive");
        }else if(flp>amz){
            System.out.println("Flipkart is cheaper");
        }



    }

}
