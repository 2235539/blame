package prog1.demo;

import java.io.FileWriter;
import java.io.IOException;

public class WriteOnFile {
    public static void main(String[] args) throws IOException {

        try {
            FileWriter fw = new FileWriter("TextFile.txt");
            fw.write("This is a text file\n");
            fw.write("The following are even numbers: \n");
            fw.write("2\n");
            fw.write("4\n");
            fw.write("6");
            fw.close();
        }
        catch(IOException ex){
            System.out.println("Error");
            ex.printStackTrace();
        }

        System.out.println("Write Successful");
    }
}