
import java.util.Random;

//Каждый вегетационный период (.passGrowingSeason())
// Любые неубранные апельсины из предыдущего сезона должны упасть.
// Дерево должно стареть на 1 год. Дерево должно расти на 2.5 фута в высоту до тех пор,
// пока оно не достигнет максимальной высоты - скажем, 25 футов. Дерево должно приносить плоды,
// если оно зрелое (то есть ему не менее шести лет) скажем, от 100 до 300 апельсинов (class Orange).
// Необходимо проверить, достаточно ли дерево зрелое для производства фруктов (.isMature()).
// Дерево должно погибнуть в возрасте 100 лет, и тебе необходимо проверить, погибло ли оно (.isDead()).
// Нужно так же проверить, есть ли на дереве апельсины (hasOranges()).
// Тебе необходимо сорвать апельсин с дерева (.pickAnOranges())
// Cоздайте переменную averageOrangeDiameter.
//Release 0
//Создайте класс апельсин с приватным полем diameter.
// Пропишите конструктор для апельсина.
// Чтобы при помощи него можно было создавать апельсины с диаметром от 7 до 15 см (int);
// Для проверки создайте несколько апельсинов в main. Убедитесь,
// что размеры апельсина колеблются в указанных значениях.
//
//Release 1
//Создайте класс OrangeTree c полями oranges, height, age:
//
//double height - это высота дерева в футах
//int age - возраст дерева в годах
//List<Orange> oranges в котором будет находиться лист апельсинов.
//Создайте в классе OrangeTree метод .passGrowingSeason() В методе отразите следующее: Дерево должно стареть на 1 год.
// Дерево должно расти за сезон на 2.5 фута в высоту до тех пор, пока оно не достигнет максимальной высоты - скажем,
// 25 футов. (Выше дерево не растет)
//
//Release 2
//Создайте у OrangeTree метод .isDead() Метод должен показывать - живо ли дерево - true, false. Возвращает тип boolean
public  class OrangeTree{
   private int age;
   private double height;
   private Orange oranges;

    public OrangeTree( int age, double height, Orange oranges) {

        this.age = age;
        this.height = height;
        this.oranges = oranges;

    }

    public OrangeTree passGrowingSeason(OrangeTree tree){
            if (age<=99 & age>6 & height<22.5){
                Random random = new Random();
                int orange = random.nextInt(100, 300);
                Orange orange1 = new Orange(orange,0);
                return new OrangeTree(age +1, height + 2.5, orange1 );
            };
        System.out.println("Это дерево пора утилизировать");
        return new OrangeTree(age, height, null);
    }
        public  boolean isMature(OrangeTree tree){
             return age > 6;
        }
         public  boolean isDead(OrangeTree tree){
             System.out.println(tree  + "Вниманте!!! Это дерево мертвое");
            return age <= 99;
        }

    public Orange getOranges() {
        return oranges;
    }

    public void setOranges(Orange oranges) {
        this.oranges = oranges;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "OrangeTree{" +
                "age=" + age +
                ", height=" + height +
                ", " + oranges;
    }
}
