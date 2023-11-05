public class Product implements Comparable<Product> {
    private String title;
    private double rating;
    private double price;
    private String category;

    public Product(String title, double rating, double price, String category) {
        this.title = title;
        this.rating = rating;
        this.price = price;
        this.category = category;
    }


    public String getTitle() {
        return title;
    }

    public double getRating(double v) {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }


    @Override
    public String toString() {
        return title + ", " + rating + ", " + price + ", " + category + "\n";
    }


    @Override
    public int compareTo(Product o) {
        if (this.rating < o.rating) {
            return -1;
        } else if (this.rating > o.rating) {
            return 1;
        } else {
            return 0;
        }
    }

}

//Подготовка к заданию
//Создайте класс товар Product с полями:
//
//название
//рейтинг
//цена
//категория
//Создайте лист из 10 товаров с разными значениями
//
//Задание 1
//Получите лист товаров, которые стоят дороже 200 евро.
//
//Задание 2
//Получите лист товаров, отсортированных по рейтингу
//
//Задание 3
//Проверьте есть ли в листе товаров, товар с названием: "Iphone XR"
//
//Задание 4 map
//Создайте новый лист товаров на основании старого, пусть в новом листе рейтинг будет увеличен на 1. Товары в исходном листе не должны измениться.
//
//Задание 5 forEach
//Измените цену товаров в исходном листе товаров: увеличьте ее на 20 евро. Товары в исходном листе должны измениться.
//
//Задание 6 reduce
//Посчитайте общую стоимость всех товаров в листе.