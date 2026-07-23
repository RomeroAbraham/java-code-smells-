import java.util.ArrayList;
import java.util.List;

public class CustomStack {
    private final List<Object> internalList = new ArrayList<>();

    public void push(Object item) {
        internalList.add(item);
    }

    public Object pop() {
        if (internalList.isEmpty()) return null;
        return internalList.remove(internalList.size() - 1);
    }

    public boolean isEmpty() {
        return internalList.isEmpty();
    }
}
