package Day9;

public class Arrays_Reading_OTP {

    public static void main(String[] args) {

        String otp = "Hi Siraj, OTP 34134 is to complete your next txxxxxxx5656";

        for (String str:otp.split(" ")){
            if (str.matches("\\d{5}")){

                System.out.println("OTP:"+str);
            }
        }


    }
}
