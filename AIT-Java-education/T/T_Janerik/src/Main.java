public class Main {
    public static void main(String[] args) {
        MyArrayList <Integer>integers = new MyArrayList();
        integers.add(7);
        integers.add(10);
        integers.add(77);
        int value1 =  integers.get(0);
        int value2 =  integers.get(1);
        int value3 =  integers.get(2);

        System.out.println(value1 + " " + value2 + " " + value3);

        MyArrayList <String> string = new MyArrayList();
        string.add("Hello");
        string.add("By");
        string.add("Ruslan");

        String s1 =  string.get(0);
        String s2 =  string.get(1);
        String s3 =  string.get(2);

        System.out.println(s1 + " " + s2 + " " + s3);
    

    }
}