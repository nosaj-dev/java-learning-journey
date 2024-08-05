package site.nosaj.exceptions.exercise6;

import java.util.*;

public class Main {

    public static void checkDupes(ArrayList<Integer> arr) throws Exception{
           HashSet<Integer> set = new HashSet<>(arr);
           if(arr.size() != set.size()){
               throw new Exception("Duplicate values found");
           }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println(arr);
        try {
            checkDupes(arr);
            System.out.println("No duplicates found");
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
