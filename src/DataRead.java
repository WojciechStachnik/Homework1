import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DataRead {
    public void reader{
        try {
            FileReader fileReader = new FileReader("Data.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

}
