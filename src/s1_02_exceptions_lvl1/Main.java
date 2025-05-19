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
        sale.addProduct(new Product("Book", 15.50f));
        sale.addProduct(new Product("Pencil", 1.20f));

        try {
            sale.calculateTotal();
            System.out.println("Preu total de la venda: " + sale.getTotalPrice() + " €");
        } catch (EmptySaleException e) {
            System.out.println("Captured exception: " + e.getMessage());
        }

        // IndexOutOfBoundsException
//        try {
//            ArrayList<String> llista = new ArrayList<>();
//            llista.add("A");
//            llista.add("B");
//            System.out.println("Element a la posició 3: " + llista.get(3)); // Error aquí
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("IndexOutOfBoundsException capturada: " + e.getMessage());
//        }

        }
    }

