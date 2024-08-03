package site.nosaj.oop.inheritance;

import java.util.ArrayList;

class ModArrayList<T> extends ArrayList<T> {
    protected T getUsingMod(int index) {
        if (size() == 0) throw new IndexOutOfBoundsException("Empty list");
        else if (index < 0) throw new IndexOutOfBoundsException("Negative index");
        else if (index >= size()) return get(index % size());
        else return get(index);
    }
}
