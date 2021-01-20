package Day6;

public class ExampleThrows {

    public static void main(String[] args) throws Exception {

        int amt = 99;
        if (amt<100){
            throw new Exception("Please retry with >=100");
        }else{
            System.out.println("Withdraw...");
        }
    }
}
