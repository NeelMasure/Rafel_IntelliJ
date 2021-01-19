package Day6;

public class DemoException2 {

    public static void main(String[]args) {

        System.out.println("Hello World");
        try{
            String name = null;
            System.out.println(name.length());

        }catch(Exception e){

        }finally {
            System.out.println("Close the connection");
        }
            System.out.println("Ending...");
    }

}

