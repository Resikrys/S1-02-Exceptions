package s1_02_exceptions_lvl1;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products;
    private float totalPrice;

    public Sale(ArrayList<Product> products) {
        this.products = new ArrayList<Product>();
        this.totalPrice = 0f;
    }

    public ArrayList<Product> getProducts() {
        return this.products;
    }

    //Afegir exception getMessage()
    public void setProducts(Product products) {
        products.add(product);
    }

//    public void addTotalPrice(float totalPrice) {
//        this.totalPrice += totalPrice;
//    }

    // For + afegir preus a totalPrice + return totalPrice
    // Exception noProducts + exception Indexoutofbounds
    public void calculateTotal(Product products) {
        this.totalPrice += totalPrice;
    }

}
