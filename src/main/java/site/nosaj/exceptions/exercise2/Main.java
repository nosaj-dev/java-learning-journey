package site.nosaj.exceptions.exercise2;

import java.util.Scanner;

public class Main {

    public static void isOdd(int number) throws IllegalArgumentException {
        if (number % 2 == 1) {
            throw new IllegalArgumentException("Entered number is odd.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        try {
            isOdd(number);
            System.out.println("Number is even.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
