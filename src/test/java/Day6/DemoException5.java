package Day6;

public class DemoException5 {

    public static void main(String[]args) {

        System.out.println("Starting");

      try{
          String[] std = new String[3];
          std[0]="Arvind";
          std[1]="Neel";
          std[2]= "Neeta";
          std[3]= "Vish";


      }finally {

          System.out.println("Close the Connection");
        }
        System.out.println("Ending");

    }
}
