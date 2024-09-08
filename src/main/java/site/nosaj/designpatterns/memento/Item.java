package site.nosaj.designpatterns.memento;

class Item {
    private String name;
    private final ItemHistory history = new ItemHistory();

    public void createState() {
        this.history.push(new ItemState(this.name));
    }

    public void undo(){
        if(!this.history.empty()) {
            this.history.pop();
            this.name = this.history.peek().getName();
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
