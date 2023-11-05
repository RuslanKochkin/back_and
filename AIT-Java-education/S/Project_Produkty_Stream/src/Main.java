import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Iphone XR", 9.9, 999.0, "Phone"));
        products.add(new Product("Iphone 10", 8.9, 899.0, "Phone"));
        products.add(new Product("Iphone XS", 9.8, 799.0, "Phone"));
        products.add(new Product("Iphone XX", 8.0, 699.0, "Phone"));
        products.add(new Product("Iphone 09", 7.1, 556.0, "Phone"));
        products.add(new Product("Iphone 08", 6.6, 350.0, "Phone"));
        products.add(new Product("Iphone 07", 5.4, 250.0, "Phone"));
        products.add(new Product("Iphone 06", 4.7, 230.0, "Phone"));
        products.add(new Product("Iphone 05", 7.6, 199.0, "Phone"));
        products.add(new Product("Iphone 03", 4.5, 160.0, "Phone"));

        List<Product> commodityRoad_200 = products.stream().
                filter((a) -> a.getPrice() > 200).toList();
        System.out.println(commodityRoad_200);

        List<Product> commodityRatingGrade = products.stream()
                .sorted((Product::compareTo)).toList();
        System.out.println(commodityRatingGrade);

        boolean SearchByProduct = products.stream().anyMatch((a) -> a.getTitle().equals("Iphone XR"));
        System.out.println(SearchByProduct);

        List<Product> newRating = new ArrayList<>();
        products.stream()
                .map(product -> new Product(product.getTitle(), product.getRating(1) + 1,
                        product.getPrice(), product.getCategory()))
                .forEach(newRating::add);
        System.out.println(newRating);

        newRating.forEach((a) -> a.setPrice(a.getPrice() + 20));
        System.out.println(products);

        double sum = newRating.stream()
                .map(Product::getPrice)
                .reduce(0.0, (a, b) -> a + b);
        System.out.println(sum);
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