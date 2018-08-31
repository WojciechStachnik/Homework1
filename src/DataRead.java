import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataRead {
    public static void reader() {
        String line = null;
        try {
            line = null;
            FileReader fileReader = new FileReader("src\\data.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            line = bufferedReader.readLine();
            SortMetod.sortingType = line;
            while ((line = bufferedReader.readLine()) != null){
               DataStorage.numbers.add(Integer.parseInt(line));
           }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}