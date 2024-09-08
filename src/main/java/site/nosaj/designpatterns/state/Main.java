package site.nosaj.designpatterns.state;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.getState().onOffOn();
        phone.getState().onHome();
        phone.getState().onHome();
        phone.getState().onOffOn();
        phone.getState().onOffOn();




    }
}
