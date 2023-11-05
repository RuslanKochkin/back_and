public class People implements Comparable<People> {
     String lName;
      int height;

    public People(String lName, int height) {
        this.lName = lName;
        this.height = 150 + (int)(Math.random()*(230 - 150 + 1));
    }

    public String getlName() {
        return lName;
    }
    @Override
    public String toString() {
        return lName + " рост-" + height;
    }

    public int compareTo(People currentMin) {
        return 0;
    }
}
