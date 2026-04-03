package generic.ex1;

public class GenericBox<T> {
    public T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
