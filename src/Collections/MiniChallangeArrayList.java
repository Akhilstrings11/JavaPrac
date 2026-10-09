package Collections;

import java.util.ArrayList;
import java.util.List;

public class MiniChallangeArrayList {

    public static void main(String[] args){
        List<String> products = new ArrayList<>();

        products.add("Iphone");
        products.add("Samsung");
        products.add("Iqoo");
        products.add("Realme");
        products.add("Vivo");

        System.out.println(products.contains("Realme"));

        System.out.println(products);

        products.remove("Realme");

        System.out.println(products);

        products.set(2, "Oppo");

        System.out.println(products);

        System.out.println(products.contains("Realme"));

        System.out.println(products.size());

        for(String product : products){
            System.out.println(product);
        }

    }

}
