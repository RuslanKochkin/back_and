import java.util.LinkedList;
import java.util.Random;

public class OrangeTree_Alicher {
    private double height;
    private int age;
    LinkedList<Orange> oranges1;

    public OrangeTree_Alicher(double height, int age) {
        this.height = height;
        this.age = age;
        this.oranges1 = new LinkedList<Orange>();
    }

    public OrangeTree_Alicher() {
        this.oranges1 = new LinkedList<Orange>();
    }

    public void passGrowingSeason() {
        // убираем несобранные апельсины с предыдущего сезона == очистили массив
        oranges1.clear();
        age++;
        if (height < 25) {
            height += 2.5;
        }
        // выращиваем апельсины на дереве
        // если зрелое и не мертвое, то приносит плоды
//        if (isMature() && !isDead()) {
//            int numberOfOranges = new Random().nextInt(100, 301);
//            for (int i = 0; i < numberOfOranges; i++) {
//                oranges1.add(new Orange_Alicher());
//            }
//        }
    }

    public boolean isMature() {
        return age >= 6;
    }

    public boolean isDead() {
        return age >= 100;
    }

    public boolean hasOranges() {
//    return !oranges.isEmpty();
        return oranges1.size() > 0;
    }

    public Orange pickOrange() {
        // если есть апельсины
        if (hasOranges()) {
            // вариант 1
            // взяли апельсин
            Orange orange = oranges1.get(oranges1.size() - 1);
            // удалили с дерева
            oranges1.remove(oranges1.size() - 1);
            // вернули взятый апельсин
            return orange;
        }
        return null;
        // вариант 2 в одну строку
        // return oranges.pop(); // если заменить все LinkedList - то можно можно будет пользоваться методом pop
    }

//    public double getAverageSizeOfOrange() {
//        if (!hasOranges()){
//            return 0;
//        }
//        double sum = 0;
//        for (Orange orange : oranges1) {
//            sum += orange.diametr;
//        }
//        return sum / oranges1.size();
//    }

    @Override
    public String toString() {
        return "OrangeTree{" +
                "height=" + height +
                ", age=" + age +
                " total oranges: " + oranges1.size() +
//                " average size: " + getAverageSizeOfOrange() +
                ", oranges=" + oranges1 +
                '}';
    }
}
