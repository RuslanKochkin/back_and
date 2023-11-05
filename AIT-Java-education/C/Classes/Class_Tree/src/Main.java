import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//Из разговора с заказчиком было выяснено следующее:
//
//Йоханес хочет создать программу, которая бы моделировала жизненный цикл апельсинового дерева в его саду.
// Чтобы убедиться, что это будет выгодно для него.
//
//Требования: Класс OrangeTree; Дерево должно быть определенного возраста (.age).
//Дерево должно иметь высоту (.height).
//
//Каждый вегетационный период (.passGrowingSeason()) Любые неубранные апельсины из предыдущего сезона должны упасть.
// Дерево должно стареть на 1 год. Дерево должно расти на 2.5 фута в высоту до тех пор,
// пока оно не достигнет максимальной высоты - скажем, 25 футов. Дерево должно приносить плоды,
// если оно зрелое (то есть ему не менее шести лет) скажем, от 100 до 300 апельсинов (class Orange).
// Необходимо проверить, достаточно ли дерево зрелое для производства фруктов (.isMature()).
// Дерево должно погибнуть в возрасте 100 лет, и тебе необходимо проверить, погибло ли оно (.isDead()).
// Нужно так же проверить, есть ли на дереве апельсины (hasOranges()).
// Тебе необходимо сорвать апельсин с дерева (.pickAnOranges()) Cоздайте переменную averageOrangeDiameter.
        Orange orange = new Orange(0,0);
        OrangeTree orangeTree1 = new OrangeTree(9, 20, orange);
        OrangeTree orangeTree2 = new OrangeTree(9, 18, orange );
        OrangeTree orangeTree3 = new OrangeTree(33, 19, orange );
        OrangeTree orangeTree4 = new OrangeTree(110, 2, orange );
        System.out.println(orangeTree1.passGrowingSeason(orangeTree1));
        System.out.println(orangeTree2.passGrowingSeason(orangeTree1));
        System.out.println(orangeTree3.passGrowingSeason(orangeTree1));
        System.out.println(orangeTree4.passGrowingSeason(orangeTree1));
        List<OrangeTree> orangeTrees = new ArrayList<>();
        orangeTrees.add(orangeTree1);
        orangeTrees.add(orangeTree2);
        orangeTrees.add(orangeTree3);
        orangeTrees.add(orangeTree4);
        sumOrange(orangeTrees);
        orangeTree4.isDead(orangeTree4);


    }
    public  static void sumOrange(List<OrangeTree> orangeTrees) {
        int sum = 0;
        for (int i = 0; i < orangeTrees.size(); i++) {
            sum = sum + Orange.getQuantity();
        }
        System.out.println(sum);
    }

}