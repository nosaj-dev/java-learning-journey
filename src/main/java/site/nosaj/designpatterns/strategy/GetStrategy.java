package site.nosaj.designpatterns.strategy;

class GetStrategy implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("Get");
    }
}
