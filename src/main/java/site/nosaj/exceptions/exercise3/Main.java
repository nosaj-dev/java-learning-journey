package site.nosaj.exceptions.exercise3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void checkFile(String fileName) throws Exception {
        try  {
            Path path = Path.of(fileName);
            String content = Files.readString(path);
            System.out.println("File read with success.");
        } catch (Exception e) {
            if (e instanceof IOException) {throw new FileNotFoundException("File not found");}
            else throw new Exception("Something happened, other than file not found exception.");

        }
    }
    public static void main(String[] args) {
        try {
            checkFile("src/main/java/site/nosaj/exceptions/exercise3/test.txt");
            checkFile("/main/java/site/nosaj/exceptions/exercise3/test.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
