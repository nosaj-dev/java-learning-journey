package site.nosaj.designpatterns.state;

class Locked extends State {
    public Locked(Phone phone) {
        super(phone);
    }

    @Override
    public void onHome() {
        phone.setState(new Unlocked(phone));
        System.out.println(phone.unlock());
    }
    @Override
    public void onOffOn() {
        phone.setState(new OffState(phone));
    }
}
