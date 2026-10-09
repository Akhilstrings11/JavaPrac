import java.util.ArrayList;
import java.util.List;

public class loops {
    public static void main(String[] args) {
        int age = 24;
        if (age >= 30) {
            System.out.println("You are too young");
        } else {
            System.out.println("You are Eligible");
        }

        int salary = 15000;

        if (salary > 15000){
            System.out.println("Great");
        } else if (salary >= 15000){
            System.out.println("Good");
        } else if (salary >= 10000) {
            System.out.println("Okay");
        } else {
            System.out.println("Not Okay");
        }

        List<String> names = new ArrayList<>();

        names.add("Akhil");
        names.add("Steven");
        names.add("Sunny");

        System.out.println(names);
    }
}
