public class SoftDrink extends Drink{
    int sugarContent;

    public SoftDrink(String title, double volume,int sugarContent) {
        super(title,volume);
        this.sugarContent = sugarContent;
    }

    @Override
    public String toString() {
        return "SoftDrink{" +
                "sugarContent=" + sugarContent +
                ", title='" + getTitle() + '\'' +
                ", volum=" + getVolume() +
                '}';
    }
}
