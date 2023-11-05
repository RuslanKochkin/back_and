public class Alcogol extends Drink{
    double strength;

    public Alcogol(String title, double volum, double strength) {
        super(title, volum);
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Alcogol{" +
                "strength=" + strength +
                ", title='" + getTitle() + '\'' +
                ", volum=" + getVolume() +
                '}';
    }
}
