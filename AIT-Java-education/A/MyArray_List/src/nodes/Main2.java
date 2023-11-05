package nodes;

public class Main2 {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.addFirst("Anna");
        list.addFirst("Konstantin");
        list.addFirst("Ruslan");
        list.addFirst("Marsel");
        list.addFirst("Dmitrii");
    }
}
//0. Повторить реализацию LinkedList
//1. Реализовать get(int index) для LinkedList
//2. Сделать класс Node вложенным в LinkedList
