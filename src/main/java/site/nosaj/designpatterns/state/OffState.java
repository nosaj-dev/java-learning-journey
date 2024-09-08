package site.nosaj.designpatterns.state;

class OffState extends State{
    public OffState(Phone phone) {
        super(phone);
    }
    @Override
    public void onHome() {
    }
    @Override
    public void onOffOn() {
        phone.setState(new Locked(phone));
        System.out.println(phone.turnOn());
    }

}
