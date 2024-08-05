package site.nosaj.time.exercise3;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day(1-31): ");
        calendar.set(Calendar.DATE,scanner.nextInt());
        System.out.println("Enter month(1-12): ");
        calendar.set(Calendar.MONTH,scanner.nextInt()-1);
        System.out.println("Enter year: ");
        calendar.set(Calendar.YEAR,scanner.nextInt());
        scanner.close();
        if(calendar.get(Calendar.DATE)==13 && calendar.get(Calendar.DAY_OF_WEEK)==Calendar.FRIDAY) {
            System.out.println("Happy friday the 13th!");
        }else {
            System.out.println("Not a friday the 13th! Better luck next time");
        }
    }
}
