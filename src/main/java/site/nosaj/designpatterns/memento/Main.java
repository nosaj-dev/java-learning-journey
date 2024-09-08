package site.nosaj.designpatterns.memento;

public class Main {
    public static void main(String[] args) {
        var a = new Item();

        a.setName("a");
        a.createState();
        a.setName("B");
        a.createState();
        System.out.println(a.getName());
        a.undo();
        System.out.println(a.getName());

    }
}
