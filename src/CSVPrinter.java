import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CSVPrinter {
    public void printCsvFile(String namefile) {
        String file = namefile;

        try(FileInputStream inputStream = new FileInputStream(file)) {

            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
