package day2;

public class Condition1 {

    public static void main(String[] args) {

        String browser = "Firefox";
        if (browser== "Chrome"){
            System.out.println("Opening Chrome");
        }else if(browser.equals("FireFox")){
            System.out.println("Opening FireFox");
        }else  if (browser.equalsIgnoreCase("IE")){
            System.out.println("Opening IE");
        }

        else{
            System.out.println("Enter Chrome");
        }

        System.out.println("Out of condition");

    }




}
