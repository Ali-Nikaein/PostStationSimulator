public abstract class Data<E> {
    E key;

    public Data(E key) {
        this.key = key;
    }

    public E getKey() {
        return key;
    }

    public void setKey(E key) {
        this.key = key;
    }
}
