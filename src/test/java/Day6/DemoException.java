package Day6;

public class DemoException {

    public static void main(String[] args) {

        System.out.println("Starting...");

        try {
            int i = 10;
            int j = 0;

            System.out.println(i / j);
        }catch (ArithmeticException a){

        }

        System.out.println("Ending..");
    }
}
