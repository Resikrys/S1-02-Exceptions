package s1_02_exceptions_lvl1;

public class Product {
    private String name;
    private float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return this.name;
    }
    public float getPrice() {
        return this.price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}
