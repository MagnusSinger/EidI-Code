package eidi;

public class List<T> {

    private T info;
    private List<T> next;

    public List(T info, List<T> next) {
        this.info = info;
        this.next = next;
    }
    public List(T info) {
        this.info = info;
        this.next = null;
    }

    public T getInfo() {
        return info;
    }
    public List<T> getNext() {
        return next;
    }

    public void setInfo(T info) {
        this.info = info;
    }
    public void setNext(List<T> next) {
        this.next = next;
    }

    public int length() {
        if (next != null) {
            return next.length();
        } else {
            return 1;
        }
    }

    public List<T> half() {
        int n = length();
        List<T> t = this;
        for (int i = 0; i < n / 2 - 1; i++) {
            t = t.getNext();
        }
        List<T> result = t.getNext();
        t.setNext(null);
        return result;
    }

    @Override
    public String toString() {
        if (next != null) {
            return info.toString() + " - " + next.toString();
        } else {
            return info.toString();
        }
    }
}
