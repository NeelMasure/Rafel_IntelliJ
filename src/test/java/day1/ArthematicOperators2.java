package day1;

import java.util.Scanner;

public class ArthematicOperators2 {

    /**
     * @Author : Neel
     * @param args
     * Integer       logical     condition
     *  +,-,*,/,%    < <= > >=   ! & ||
     *
     */


    public static void main(String[] args) {

        //Class name(Scanner) : ref(sc/ scanner) = Class object(Scanner)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = scanner.nextInt();



        int sum = a+b;
        System.out.println("Sum of two numbers is : "+ sum);
        int sub = a-b;
        System.out.println("Subraction of two numbers :"+ sub);
        int mul = a*b;
        System.out.println("Multiplication of two numbers :"+ mul);
        int div = a/b;
        System.out.println("Division of two numbers :"+ div);
        int per = a/b*100;
        System.out.println("Percentage of two numbers :"+ per);



    }



}
