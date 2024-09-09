package site.nosaj.designpatterns.strategy;

class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new GetStrategy());
        context.doSomething();
        context.setStrategy(new PushStrategy());
        context.doSomething();
    }
}
