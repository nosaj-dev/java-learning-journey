package site.nosaj.exceptions.exercise4;

import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static String[]  method(String fileName) throws Exception {
        try{
            Path filePath = Path.of(fileName);
            String content = Files.readString(filePath);
            return content.split(",");
        }catch (Exception e){
            throw new Exception("Something happened in the process of reading and splitting the file.");
        }
    }

    public static void isPositive(String[] numbers) throws Exception {
       for(String number : numbers){
           if(Integer.parseInt(number) > 0){
               throw new Exception("One of read numbers is positive.");
           }
       }
    }

    public static void main(String[] args) {
        try{
            String[] numbers = method("src/main/java/site/nosaj/exceptions/exercise4/numbers.txt");
            isPositive(numbers);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
