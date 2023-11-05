import java.time.LocalDate;

public class Violin {
   protected String name;
    protected LocalDate localDate;
    Violin(String name, LocalDate localDate){
        this.name = name;
        this.localDate = localDate;

    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public String toString() {
        return "Violin{" +
                "name='" + name + '\'' +
                ", localDate=" + localDate +
                '}';
    }
}
//Создайте класс скрипка. Пусть у скрипки будут поля:
//
//String имя мастера,
//LocalDate дата производства
