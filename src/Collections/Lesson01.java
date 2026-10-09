package Collections;

import java.util.ArrayList;
import java.util.List;

public class Lesson01 {

    public static void main (String[] args){
        List<String> products = new ArrayList<>();
        products.add("Apple");
        products.add("Samsung");
        products.add("Sony");

//        products.remove(0);

        System.out.println(products);
        System.out.println(products.size() + " products");

    }

    class Product{
        int id;
        String name;
        double price;

        Product(int id, String name, double price){
            this.id = id;
            this.name = name;
            this.price = price;
        }

    }

}
