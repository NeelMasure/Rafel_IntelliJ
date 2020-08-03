package day1;

public class Calculator {

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        cal.add(500,1000);

    }

        public void add(int a,int b ){
            int sum = a+b;
            System.out.println(sum);

    }
}
