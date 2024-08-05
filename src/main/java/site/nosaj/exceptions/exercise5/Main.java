package site.nosaj.exceptions.exercise5;

import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static String fileIsEmpty(String fileName) throws Exception {
        String content;
        Path path = Path.of(fileName);
        content = Files.readString(path);
        if (content.isEmpty()) throw new Exception("File is empty");
        return content;
    }

    public static void main(String[] args) {
        try {
            System.out.println(fileIsEmpty("src/main/java/site/nosaj/exceptions/exercise5/test.txt"));
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println(fileIsEmpty("src/main/java/site/nosaj/exceptions/exercise5/notEmpty.txt"));
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
