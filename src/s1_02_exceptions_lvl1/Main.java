package s1_02_exceptions_lvl1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Empty sale trial
        Sale sale = new Sale();

        try {
            sale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println("Captured exception: " + e.getMessage());
        }

        //Adding products trial
        sale.addProduct(new Product("Book", 15.50));
        sale.addProduct(new Product("Pencil", 1.25));

        try {
            sale.calculateTotal();
            System.out.println("Total sale price: " + sale.getTotalPrice() + " €");
        } catch (EmptySaleException e) {
            System.out.println("Captured exception: " + e.getMessage());
        }

        // IndexOutOfBoundsException
        try {
            Product p = sale.getProducts().get(5); // Índex out of arraylist length
            System.out.println("Product in position 5: " + p.getName());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException captured: " + e.getMessage());
        }

        }
    }

