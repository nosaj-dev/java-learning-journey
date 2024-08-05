package site.nosaj.exceptions.exercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void checkFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        try (FileReader reader = new FileReader(fileName)) {
            System.out.println("File read with success.");
        } catch (Exception e) {
            throw new FileNotFoundException("File not found");
        }
    }
    public static void main(String[] args) {
        try {
            checkFile("src/main/java/site/nosaj/exceptions/exercise3/test.txt");
            checkFile("/main/java/site/nosaj/exceptions/exercise3/test.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
