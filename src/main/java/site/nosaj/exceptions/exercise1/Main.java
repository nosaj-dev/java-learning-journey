package site.nosaj.exceptions.exercise1;

public class Main {
    public static void generateCustomException() throws CustomException {
        throw new CustomException();
    }

    public static void main(String[] args) {
        try {
            generateCustomException();
        } catch (CustomException e) {
            System.out.println("Received next exception: " + e.getMessage());
        }
    }
}