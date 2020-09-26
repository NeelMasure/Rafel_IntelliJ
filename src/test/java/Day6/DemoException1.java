package Day6;

import java.util.Scanner;

public class DemoException1 {

    public static void main(String[] args) {

        System.out.println("Starting...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int div = sc.nextInt();
try {
    int i = 100;
    System.out.println(i / div);
}catch (Exception e){
    e.printStackTrace();

}


        System.out.println("Ending..");
    }
}
