package site.nosaj.designpatterns.state;

class Phone {
    private State state;

    public Phone() {
        this.state = new OffState(this);
    }

    public void setState(State state) {
        this.state = state;
    }
    public State getState(){
        return this.state;
    }

    public String lock(){
        return "Locked";
    }

    public String unlock(){
        return "Unlocked";
    }
    public String home(){
        return "Home";
    }
    public String turnOn(){
        return "Turned on";
    }
}
