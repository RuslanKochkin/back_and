package nodes;

public class MyLinkedList<T> implements MyList<T> {
    private Node<T> first; // ссылка на первый элемент
    private int size; // фактическое количество элементов

    public MyLinkedList() {
        this.first = null;
    }
    @Override
    public T get(int index) {
        checkElementIndex(index);
        if (index < (size >> 1)) {
            Node<T> node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return (T) node;
        } else {
            Node<T> node = first;
            for (int i = size - 1; i > index; i--) {
                node = node.next;
            }
            return (T) node;
        }
    }

    @Override
    public void add(T t) {

    }

    @Override
    public void addFirst(T value) {
        Node<T> node = new Node<>(value); // создали новый узел
        if (first != null) { // если в списке уже есть элемент
            node.setNext(first.getNext()); // новый узел ссылается на первый
        }
        first = node; // новый узел и есть первый
    }

    @Override
    public void set(int index, T element) {

    }
    private class Node<T> {
        private T value; // значение любого типа, которое хранит узел

        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }
        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
    private void checkElementIndex(int index) {
        if (!isElementIndex(index)) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }
}


