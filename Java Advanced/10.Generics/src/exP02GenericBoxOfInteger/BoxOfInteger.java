package exP02GenericBoxOfInteger;

import java.util.ArrayList;
import java.util.List;

public class BoxOfInteger<T> {
    private List<T> values;

    public BoxOfInteger() {
        this.values = new ArrayList<>();
    }

    public void add (T element) {
        values.add(element);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T value : values) {
            sb.append(String.format("%s: %s%n", value.getClass().getName(), value.toString()));
        }
        return sb.toString();
    }
}
