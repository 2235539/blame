package prog1.midterms.demo;

import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {

        try {
            FileReader fr = new FileReader("TextFile.txt");
            int i;
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
            fr.close();
        }
        catch(IOException ex){
            System.out.println("File does NOT exist");
            ex.printStackTrace();
        }
    }
}