import java.util.ArrayList;
public class CustomStack extends ArrayList<Object> {
    
    public void push(Object item) {
        this.add(item);
    }

    public Object pop() {
        if (this.isEmpty()) return null;
        return this.remove(this.size() - 1);
    }

    @Override
    public Object remove(int index) {
        throw new UnsupportedOperationException("No se permite eliminar por índice en una Pila");
    }
}
