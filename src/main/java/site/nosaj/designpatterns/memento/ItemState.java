package site.nosaj.designpatterns.memento;

class ItemState {
    private final String name;

    public ItemState(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
