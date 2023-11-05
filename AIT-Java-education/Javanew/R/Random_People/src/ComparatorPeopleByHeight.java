import java.util.Comparator;
import java.util.List;

public class ComparatorPeopleByHeight implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
        return o1.height-o2.height;
    }
}
