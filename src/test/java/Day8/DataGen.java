package Day8;

import Day7.Generic;
import com.github.javafaker.Faker;

import java.io.IOException;
import java.util.Locale;

public class DataGen {

    public static void main(String[] args) throws IOException {

        Locale locale;
//        Locale lc=  new Locale("en-IND");
//        Faker fak = new Faker(lc);
//        String fn = fak.name().fullName();
//        String email = fn.replace(" ","").replace(".","")+ "@gmail.com";
//        System.out.println(email);


//        System.out.println(Generic.getEmail());
//        System.out.println(Generic.getName());

        Generic.setValue("TC001","Fullname",Generic.getName());
        Generic.setValue("TC001","Email",Generic.getEmail());

    }
}
