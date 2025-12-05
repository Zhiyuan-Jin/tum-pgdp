package pgdp.collections;

public class List {

    private int size;
    private Element head;
    private Element tail;


// TODO: do your programming magic! 🐧

    public boolean isEmpty() {
        // TODO: do your programming magic! 🐧
        return size == 0;
    }

    public void clear() {
        // TODO: do your programming magic! 🐧
        head = tail = null;
        size = 0;
    }

    public void add(String value) {
        // TODO: do your programming magic! 🐧
        if (size == 0) {
            head = tail = new Element(value);
        } else {
            tail.next = new Element(value);
            tail = tail.next;
        }
        size++;
    }

    public boolean add(int index, String value) {
        // TODO: do your programming magic! 🐧
        Element e = new Element(value);
        if (index > size || index < 0) {
            return false;
        }
        if (index == 0) {
            e.next = head;
            head = e;
            if (size == 0) {
                tail = e;
            }
        } else if (index == size) {
            tail.next = e;
            tail = e.next;
        } else {
            Element prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
                e.next = prev.next;
                prev.next = e;
            }
            size++;
        }
        return true;
    }

    public String get(int index) {
        // TODO: do your programming magic! 🐧
        if (index < 0 || index >= size) {
            return null;
        }
        Element current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    public void remove(int index) {
        // TODO: do your programming magic! 🐧
        if (index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            head = head.next;
            size--;
            if (size == 0)
                tail = null;
            {
                return;
            }
        }
        Element prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        if (prev.next == tail) {
            tail = prev;
            prev.next = null;
        } else {
            prev.next = prev.next.next;
        }
        size--;

    }

    /*
     * returns String representation of the list, uncomment after doing your programing magic! 🐧
     */
    /*
    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("[ ");
        Element current = head;
        for (int i = 0; i < size; i++) {
            out.append(current.toString());
            if (i != size - 1) {
                out.append(", ");
            }
            current = current.next;
        }
        out.append(" ]");
        return out.toString();
    }
    */

    private static class Element {
        // TODO: do your programming magic! 🐧
        private String value;
        private Element next;

        public Element(String value) {
            this.value = value;
            this.next = null;
        }

        public Element(String value, Element next) {
            this.value = value;
            this.next = next;
        }
// TODO: remove comment after doing your programming magic! 🐧
        /*
        @Override
        public String toString() {
            return value;
        }
        */
    }
}
