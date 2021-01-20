package Day7;

import java.io.File;
import java.io.IOException;

public class FileCreation {

    public static void main(String[] args) throws IOException {

        //C:\Users\Neel\IdeaProjects\Rafel\TestData

        String apath = "C:\\Users\\Neel\\IdeaProjects\\Rafel\\TestData";

        String rpath= System.getProperty("user.dir")+ File.separator+"TestData"+File.separator+"Demo.txt";

        System.out.println(apath);
        System.out.println(rpath);

        File file = new File(rpath);
        if(file.exists()){
            System.out.println("File exits!");
        }else{
            file.createNewFile();
            System.out.println("File created!");
        }

    }

}
