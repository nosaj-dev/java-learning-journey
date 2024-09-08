package site.nosaj.designpatterns.state;

 class Unlocked extends State{
     public Unlocked(Phone phone) {
        super(phone);
     }
     @Override
     public void onHome() {
         System.out.println(phone.home());
     }
     @Override
     public void onOffOn() {
        phone.setState(new Locked(phone));
        System.out.println(phone.lock());
     }
 }
