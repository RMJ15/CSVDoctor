import java.io.File;

public class CSVExtensionChecker {
    File file = null;

    public boolean isCsvFile(String fileName) {
        file = new File(fileName);
        String extensionFile = file.getName();

        return extensionFile.endsWith(".csv");

    }
}
