package site.nosaj.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        ModArrayList<String> modArrayList = new ModArrayList<>();
        modArrayList.add("1");
        modArrayList.add("2");
        modArrayList.add("3");
        System.out.println(modArrayList.getUsingMod(4));
    }
}
