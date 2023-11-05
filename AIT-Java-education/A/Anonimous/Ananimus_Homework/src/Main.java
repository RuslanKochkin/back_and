import com.sun.jdi.connect.Connector;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Persons person1 = new Persons() {
            @Override
            public String lNameFName(String str1, String str2) {
                if (str1.length() >= str2.length()) {
                    return str2;
                } else {
                    return str1;
                }
            }
        };
        System.out.println(person1.lNameFName("Ruslan", "Kochkin"));
//-------------------------------------------
        Persons person2 = (str1, str2) -> {
            if (str1.length() >= str2.length()) {
                return str1;
            } else {
                return str2;
            }
        };
//---------------------------------------***
        Peoples peoples1 = (name, age) -> {
            String result = name.repeat(age);
            return result.toString();
        };
        System.out.println(repeat(peoples1, "Ruslan: ", 10));
    }
    public static String repeat(Peoples peoples1, String name, int b) {
        return peoples1.person(name, b);
    }
}




