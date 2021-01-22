package Day7;

import org.ini4j.Ini;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadNWriteINI {

    public static void main(String[] args) throws IOException{

//        Generic.setValue("TC003","url","https;//wwww.amazon.com");
        String url = Generic.getValue("TC003","url");
        System.out.println(url);
    }

}
