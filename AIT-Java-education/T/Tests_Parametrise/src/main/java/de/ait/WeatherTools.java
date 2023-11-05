package de.ait;

public class WeatherTools {
    //Создайте класс WeatherTools c методом
    //
    //public static String getWindDescription(double speed, boolean isGusty) Этот метод принимает скорость ветра и параметр сообщающий является ли ветер порывистым. Корреляция скорости ветра и описания:
    //<1 == Calm
    //1-5 == Light Air
    //6-11 == Light Breeze
    //12-19 == Gentle Breeze
    //20-28 == Moderate Breeze
    //29-38 == Fresh Breeze
    //Можете дополнительно учесть остальные типы ветра из таблицы по ссылке
    //
    //Пример работы метода:
    //getWindDescription(20, true) -> "Gusty Moderate Breeze with speed of 20 km"
    //getWindDescription(20, false) -> "Moderate Breeze with speed of 20 km"
    //getWindDescription(30, true) -> "Gusty Moderate Breeze with speed of 30 km"
    //getWindDescription(30, false) -> "Moderate Breeze with speed of 30 km"
    //Создайте тесты для методов.

    public static String getWindDescription(double speed, boolean isGusty) {
        if (speed < 1) {
            return "Calm " + speed + " km";
        }
        if (speed <= 5 && isGusty) {
            return "Gusty Light Air with speed of " + speed + " km";
        }
        if (speed <= 5) {
            return "Light Air with speed of " + speed + " km";
        }
        if (speed <= 11 && isGusty) {
            return "Gusty Light Breeze with speed of " + speed + " km";
        }
        if (speed <= 11) {
            return "Light Breeze with speed of " + speed + " km";
        }
        if (speed <= 19 && isGusty) {
            return "Gusty Gentle Breeze with speed of " + speed + " km";
        }
        if (speed <= 19) {
            return "Gentle Breeze with speed of " + speed + " km";
        }
        if (speed <= 28 && isGusty) {
            return "Gusty Moderate Breeze with speed of " + speed + " km";
        }
        if (speed <= 28) {
            return "Moderate Breeze speed of " + speed + " km";
        }
        if (speed <= 38 && isGusty) {
            return "Gusty Fresh Breeze with speed of " + speed + " km";
        }
        if (speed <= 38) {
            return "Fresh Breeze with speed of " + speed + " km";
        }
        return "Invalid parameters";
    }
}

