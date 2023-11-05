public class Drink {
    String title;
    double volume;

    public String getTitle() {
        return title;
    }

    public double getVolume() {
        return volume;
    }

    public Drink(String title, double volume) {
        this.title = title;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "title='" + title + '\'' +
                ", volum=" + volume +
                '}';
    }
}
