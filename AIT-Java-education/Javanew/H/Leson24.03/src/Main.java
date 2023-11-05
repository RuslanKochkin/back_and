import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // У нас три раунда напитков -
        // В меню три позиции: "wine", "beer", "vodka"
        // Официант спрашивает у человека три раза, что тот будет пить.
        // Выберите первый напиток, и т.д.
        // a.
        // Если выпили водку хотя бы в одном из раундов:
        // - то выводим в консоль фразу: "Не стоило этого делать, не помню, что произошло дальше"
        // b.
        // Если пили пиво после вина - то нужно вывести фразу:
        // "Ох, не стоило понижать градус"
        // В противном случае вывести фразу:
        // "Какой прекрасной была вечеринка"
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Выберите напиток раунд 1");
//        String drink1 = scanner.nextLine();
//        System.out.println("Выберите напиток раунд 2");
//        String drink2 = scanner.nextLine();
//        System.out.println("Выберите напиток раунд 3");
//        String drink3 = scanner.nextLine();
//
//        boolean isDrunkVodka = (
//                drink1.equals("vodka") || drink2.equals("vodka") || drink3.equals("vodka")
//        );
//        if(isDrunkVodka){
//            System.out.println(
//                    "Не стоило этого делать, не помню, что произошло дальше");
//        } else {
        // вино вино пиво - понижение   *1  *2
        // вино пиво пиво - понижение   *1
        // вино пиво вино - понижение   *1
        // пиво вино пиво - понижение       *2

        // Условие проверяет для случаев, когда вино в первом положении
//            boolean виноПоложение1 = drink1.equals("wine") && (drink2.equals("beer") ||
//            drink3.equals("beer"));
        // Условие проверяет для случаев, когда вино во втором положении
//            boolean виноПоложение2 =
//                    drink2.equals("wine") && drink3.equals("beer");
//                                               // Объединили оба условия через ИЛИ
//            boolean isBadComboOfDrinks =
//                     виноПоложение1 || виноПоложение2;
//            if (isBadComboOfDrinks){
//                System.out.println("Ох, не стоило понижать градус");
//            } else {
//                System.out.println("Какой прекрасной была вечеринка");
//            }
//        }
//-----------------------------------------------------------
        // && истинно только, когда истина && истина
        // || истинно, когда хотя бы один из операндов истинен
//----------------------------------------------------------------
//   Задание 1
//   Утро субботы, вчера у нас был корпоратив. На завтрак нужно приготовить бутерброд.
//
//   Пусть программа спрашивает, что вы хотите положить для каждого из 4 ингредиентов?
//   "Что вы положите вниз?"
//   "Что дальше?" и т.д.
//
//    Из ингредиентов у нас есть:
//    хлеб - bread,
//    помидор- tomato,
//    ветчина - hum.
//    сыр - cheese
//    Если вниз бутерброда положили что-нибудь кроме хлеба - программа выведет в консоль одну фразу:
//   "Какой необычный бутерброд". Если ветчина будет сверху сыра - программа выведет: "Идеальный бутерброд",
//    в противном случае: "Вкусный бутерброд".
//
//                Примеры:
//
//        для вводов: cheese, bread, tomato, hum -> "Какой необычный бутерброд"

//        для вводов: bread, cheese, tomato, hum -> "Идеальный бутерброд"
//        для вводов: bread, tomato, cheese, hum -> "Идеальный бутерброд"

//        для вводов: bread, hum, cheese, tomato, -> "Вкусный бутерброд"
//        для вводов: bread, tomato, tomato, tomato, -> "Вкусный бутерброд"
//        для вводов: bread, tomato, hum, hum, -> "Вкусный бутерброд" и т.д.
        //Мое решение-------------------
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Какой ингридиент 1?: ");
//        String ingredient1 = scanner.nextLine();
//        System.out.println("Какой ингридиент 2?: ");
//        String ingredient2 = scanner.nextLine();
//        System.out.println("Какой ингридиент 3?: ");
//        String ingredient3 = scanner.nextLine();
//        System.out.println("Какой ингридиент 4?: ");
//        String ingredient4 = scanner.nextLine();
//        boolean  unusualSandwich = ingredient1.equals("cheese") || ingredient1.equals("tomato") || ingredient1.equals("hum");
//        if (unusualSandwich) {
//            System.out.println(
//                    "Какой необычный бутерброд");
//        } else {
//            boolean b1 = ingredient2.equals("cheese")&&ingredient3.equals("tomato") && ingredient4.equals("hum");
//            boolean b2 = ingredient2.equals("tomato")&&ingredient3.equals("cheese") && ingredient4.equals("hum");
//            boolean idealSandwich = b1||b2;
//            if ( idealSandwich) {
//                System.out.println("Идеальный бутерброд");
//            } else {
//                System.out.println("Вкусный бутерброд");
//            }
//        }
//--------------------------------  Пример теста  --------------------------
//        int score = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Сколько бит в байте?");
//        String rightAnswer1 = "8";
//        String answer1 = scanner.nextLine();
//        if (rightAnswer1.equals(answer1)){
//            System.out.println("Правильно");
//            score = score + 1;
//        } else {
//            System.out.println("Попробуйте еще раз");
//            answer1 = scanner.nextLine();
//            if(answer1.equals(rightAnswer1)){
//                System.out.println("Правильно");
//                score = score + 1;
//            } else {
//                System.out.println("Это неправильный ответ");
//                System.out.println("Правильный ответ:"+ rightAnswer1);
//            }
//        }
//        System.out.println("Сколько примитивных типов в Java?");
//        String rightAnswer2 = "8";
//        String answer2 = scanner.nextLine();
//        if (rightAnswer2.equals(answer2)){
//            System.out.println("Правильно");
//            score = score + 1;
//        } else {
//            System.out.println("Это неправильный ответ");
//            System.out.println("Правильный ответ:"+ rightAnswer2);
//        }
//        System.out.println("Общий счет: " + score);

//-------------------------------про хорошее настроение-----------------------------------------------------------------------
//        Задача 2
//        Написать программу, которая спрашивает у пользователя его настроение, дальше два варианта:
//
//        если ответ был "хорошо": выводит в консоль "Рад за тебя".

//                если ответ был любой другой: спрашивает: "Но ты же оптимистично настроен?"
//        если ответ на второй вопрос: да - выводит "Так держать"
//                если ответ на второй вопрос любой другой - выводит "Не кисни!"

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Напишите слово \"хорошо\" если у вас хорошее настроение: ");
//        String goodOrNot = scanner.nextLine();
//        String good = "хорошо";
//        if (goodOrNot.equalsIgnoreCase(good)) {
//            System.out.println("Рад за тебя");
//        }else{
//            System.out.println("Но ты же оптимистично настроен?: ");
//            String okOrYes = scanner.nextLine();
//            String yes = "Да";
//            if (okOrYes.equalsIgnoreCase(yes)){
//                System.out.println("Так держать");
//            }else {
//                System.out.println("Не кисни");
//            }
//        }
//-------------------------------Площадь и периметр круга использование Math----------------------------------
//        Написать программу для подсчета периметра и площади круга.
//        Задайте значение радиуса в программе и выведите на экран значение периметра и площади.
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Set the radius of the circle: ");
//        double KreisRadius = scanner2.nextDouble();
//        double perimeter = 2*Math.PI*KreisRadius;
//        System.out.println("Circumference is: " + perimeter);
//        double area  = Math.pow(KreisRadius,2)*Math.PI;
//        System.out.println("Area of a circle is: " + area);
//----------------------------------------Методы Math---------------------------------------------------
        //perimeter = Math.round(perimeter * 100)/100.0; Способ округления до двух цифер после запятой
        // Math.abs - метод - модуль - возвращает абсолютное значение  - без минуса
        //Math.abs - убирает знак минус от числа
        //Math.PI добовляет число пи
        //Math.pow(KreisRadius,2); //операция возведения в степень
        //Метод Math.ceil() округляет число до целого
        // округление до ближайшего
//        double m2 = Math.round(5.7);
//        System.out.println(m2);      // 6
//        // округление до меньшего    // floor переводится как пол
//        double m3 = Math.floor(5.8);
//        System.out.println(m3);      // 5
//        // округление до большего    // ceiling переводится как потолок
//        double m4 = Math.ceil(7.1);
//        System.out.println(m4);      // 8
//        // квадратный корень         // square root
//        double m5 = Math.sqrt(9);
//        // Math.cbrt(9); - кубический корень - если кому-то нужен
//        System.out.println(m5);      // 3
//-----------------------------------------------------------
        // && истинно только, когда истина && истина
        // || истинно, когда хотя бы один из операндов истинен
//----------------------------------------------------------------
        // 4 % 3 = одна целая тройка, а *** результат единица  ***
        // 5 % 3 = одна целая тройка, а *** результат двойка   ***
        // 6 % 3 = две целых тройки,  а *** результат ноль     ***
        // 7 % 3 = две целых тройки,  а *** результат единица  ***
        //-------------------------------------  Тема принтов  ------------------------
        //%f - вывод дробных чисел в лбом месте строки
        //%n - строчный перенос
        //%f2 - вывод дробных чисел в любом месте строки с округлением до двух чисел после запятой
        //%f3 - вывод дробных чисел в любом месте строки с округлением до трех чисел после запятой
        //%d - выводит целочисленные значения
        //%s - Выводит строчные значения стринг
        //%c - Выводит как char по коду Unicod
        //System.out.printf("Circumfer%fence is: %f", perimennaya,perimennaya) //Форматированный вывод не переносит на другую строку
        //System.out.printf("a:%d b:%d c:%d %s %c " a, b, c, stroka, char) //Форматированный вывод не переносит на другую строку
        //System.out.printf - когда форматированный вывод
//------------------------------------Свич кейс синтаксис-----------------------------------------------------
// Пример 1:
        // пользователь вводит число от 1 до 4
        //ваша программа должна вывести один два три или четыри соответственно
//        Scanner scanner = new Scanner(System.in);
//        int znachenie = scanner.nextInt ();
//        switch (znachenie) {
//            case 1: System.out.println(" один ");break;
//            case 2: System.out.println(" один ");break;
//            default: System.out.println("Число введено не верно");
//        }
        // С дробными числами она не работает
        // Пример 2:

//       Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите имя: ");
//        String name = scanner.nextLine ();
//        switch (name){
//            case"jack":
//                System.out.printf("привет %s! Давно не заходил%n", name); break;
//            case"john":
//                System.out.printf("привет %s! Давно не заходил%n", name); break;
//
//            case"Вася":
//                System.out.println("Ура");
//            case"Петя":
//                System.out.printf("привет %s! Давно не заходил%n", name); break;
//
//            default:System.out.println("Я Вас не знаю");
//        }
        //--------------------------------------------------------------------------------------------

//        Пользвтель вводит с клавиатуры номер месяца (числом), ваша программа должна выводить строку вида:
//        "Месяц № __ это название_месяца"
//        Например, если пользователь ввел 2, то
//        "Месяц №2 это февраль"
//        Для вывода строки используйте printf

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ведите номер месяца: ");
//        int number = scanner.nextInt ();
//        switch (number) {
//            case 1:
//                System.out.printf(" Месяц№%d это Январь", number);
//                break;
//            case 2:
//                System.out.printf(" Месяц№%d это Февраль", number);
//                break;
//            case 3:
//                System.out.printf(" Месяц№%d это Март", number);
//                break;
//            case 4:
//                System.out.printf(" Месяц№%d это Апрель", number);
//                break;
//            case 5:
//                System.out.printf(" Месяц№%d это Май", number);
//                break;
//            case 6:
//                System.out.printf(" Месяц№%d это Июнь", number);
//                break;
//            case 7:
//                System.out.printf(" Месяц№%d это Июль", number);
//                break;
//            case 8:
//                System.out.printf(" Месяц№%d это Август", number);
//                break;
//            case 9:
//                System.out.printf(" Месяц№%d это Сентябрь", number);
//                break;
//            case 10:
//                System.out.printf(" Месяц№%d это Октябрь", number);
//                break;
//            case 11:
//                System.out.printf(" Месяц№%d это Ноябрь", number);
//                break;
//            case 12:
//                System.out.printf(" Месяц№%d это Декабрь", number);
//                break;
//            default:System.out.println("такого месяца несуществует");

//        }

        //Пользвтель вводит с клавиатуры месяц (строкой), ваша программа должна выводить строку вида:
        //"название_месяца это сезон"
        //Например, если пользователь ввел февраль, то
        //"февраль это зима"
        //Для вывода строки используйте printf

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ведите название месяца: ");
//        String month = scanner.nextLine().toLowerCase();
//        switch (month) {
//            case "декабрь":
//            case "январь":
//            case "февраль":
//                System.out.printf("Месяц %s это Зима", month);
//                break;
//            case "март":
//            case "апрель":
//            case "май":
//                System.out.printf("Месяц %s это Весна", month);
//                break;
//            case "июнь":
//            case "июль":
//            case "август":
//                System.out.printf("Месяц %s это Лето", month);
//                break;
//            case "сентябрь":
//            case "октябрь":
//            case "ноябрь":
//                System.out.printf("Месяц %s это Осень", month);
//                break;
//                default:
//                System.out.println("Сам токой");
//        }
        //----------------------------Методы---------------------------------------------
        // Методы
        //-могут преобразовывать значения
        // обьявление метода по логике или преобразованию
        //значение [B
        hello(); // внутри предыдущего метода main
        robbery();
        //вызываем новый метод в переменной
        int result = addFive(100);
        System.out.println(result);


    }
    public static  int addFive(int number){
        return number +5;
    }
    public static void hello() {
        System.out.println("Добрый день");
        System.out.println("Как ваши дела");


//      robbery(); //методы можно вызывать из методов

    }
    public static void robbery(){
        hello();
        System.out.println("Это ограбление поэтому деньги в мешок");
        System.out.println("Если будете делать как надо никто не постродает");
    }
    public static void multiplyByEight(){

    }


}


