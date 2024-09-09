package site.nosaj.designpatterns.strategy;

public class PushStrategy implements Strategy{
    @Override
    public void doSomething() {
        System.out.println("Push");
    }
}
