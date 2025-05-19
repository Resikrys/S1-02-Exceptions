package s1_02_exceptions_lvl1;

import java.util.ArrayList;

public class Main {

    static ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args) {
    //Crear productes i guardar-los a l'array (sale instance) + instance calculateTotal
        Product product1 = new Product("apple", 2.75f);
        Product product2 = new Product("banana", 3.40f);
        Product product3 = new Product("pumpkin", 6.99f);

        System.out.println(products);

        }
    }

