package s1_02_exceptions_lvl1;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0f;
    }

    public ArrayList<Product> getProducts() {
        return this.products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

public void calculateTotal() throws EmptySaleException {
    if (products.isEmpty()) {
        throw new EmptySaleException("To add a sale, first you have to add products.");
    }

    for (Product p : products) {
        totalPrice += p.getPrice();
    }
}

    public double getTotalPrice() {
        return totalPrice;
    }

}
