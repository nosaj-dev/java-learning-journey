package site.nosaj.time.exercise2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month in number format(1-12): ");
        int month = scanner.nextInt()-1;
        scanner.close();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, month);
        System.out.println("Mondays of the input month: " + "\n");
        for(int i = 1; i <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH); i++){
            calendar.set(Calendar.DATE, i);
            if(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY){
                System.out.println(calendar.get(Calendar.DATE)+ "\n");
            }
        }

    }

}