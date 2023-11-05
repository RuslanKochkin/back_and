//Java. Создайте обобщенный класс рюкзак Backpack с полями String brand,
//и параметризированным полем content.
//сontent должен быть ограничен классом Book;
//Создайте рюкзак книг с книгой внутри.
public class Backpack<T extends Book> {
    protected String brand;
    protected T content;

    public Backpack(String brand, T content) {
        this.brand = brand;
        this.content = content;
    }
    public static void main(String[] args) {
        Book book = new Book("Java"); // Создаем экземпляр класса Book
        Backpack<Book> backpack = new Backpack<>("Kathy Sierra & Bert Bates", book); // Создаем рюкзак с книгой внутри

        System.out.println(backpack);
        System.out.println("Content: " + backpack.content);
    }

    public String toString() {
        return brand  + content;
    }
}
