package Day9;

public class Arrays_Reading_URL {

    public static void main(String[] args) {

        String url = "Hi Siraj, https://www.google.com";

        for (String str:url.split(" ")){
            if (str.contains("https")){

                System.out.println(str);
            }
        }


    }
}
