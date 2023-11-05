public class MyLinkedList<T> implements MyList<T> {
    private Node<T> first; // ссылка на первый элемент

    private int count; // сколько всего элементов в списке
    private Node<T> last;

    public MyLinkedList() {
        this.first = null;
    }


    @Override
    public T get(int index) {
        checkIndex(index);

        Node<T> current = first; // завели переменную, которая указывает на начало списка
        for (int i = 0; i < index; i++) {
            current = current.next; // переходим к следующему после текущего
        }

        return current.value;
    }

    @Override
    public void add(T element) {
        Node<T>node = new Node<>(element);
        if(first!=null){
            this.last.next = node;
            last = node;
        }else {
            first = node;

        }
        last = node;
        count++;
    }

    @Override
    public void addFirst(T value) {
        Node<T> node = new Node<>(value); // создали новый узел
        if (first != null) { // если в списке уже есть элемент
            node.next = first; // новый узел ссылается на первый
        }else {
            last = node;
        }
        first = node; // новый узел и есть первый
        count++;
    }

    @Override
    public void set(int index, T element) {
        checkIndex(index);
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.value = element;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
    }

    private static class Node<E> {
        private E value; // значение любого типа, которое хранит узел

        private Node<E> next; // ссылка на следующий элемент

        public Node(E value) {
            this.value = value;
        }
    }

}