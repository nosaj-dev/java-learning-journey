package site.nosaj.time.exercise1;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = scanner.nextInt();
        scanner.close();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        for(int i = 0; i < 12; i++) {
            calendar.set(Calendar.MONTH, i);
            int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.println(calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH) + " has " + maxDay + " days.");
        }
    }
}
