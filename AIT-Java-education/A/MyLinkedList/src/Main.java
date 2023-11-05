public class Main {
    public static void main(String[] args) {
        MyLinkedList<String>list = new MyLinkedList<>();
        list.addFirst("Anna");
        list.addFirst("Kostya");
        list.addFirst("Ruslan");
        list.addFirst("Marsel");
        list.addFirst("Dmitrii");

        list.set(3, "Kristina");
        System.out.println(list.get(3));

        list.add("irina");
        list.add("Natacha");
        list.add("Aliona");
        System.out.println(list.get(5));
        System.out.println(list.get(6));
        System.out.println(list.get(7));


    }
}