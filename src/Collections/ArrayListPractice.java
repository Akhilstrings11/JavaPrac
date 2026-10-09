package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args){

        List<String> products = new ArrayList<>();

        products.add("Iphone");
        products.add("Samsung");
        products.add("Iqoo");
        products.add("Realme");
        products.add("Vivo");

        System.out.println("Products:- " + products);

        System.out.println(products.get(1));

        products.set(3, "Oppo");

        System.out.println(products);

        products.remove(1);

        System.out.println(products);

        System.out.println(products.contains("Iphone"));

        System.out.println(products.size());

        for (String product : products){
            System.out.println(product);
        }

    }

}
