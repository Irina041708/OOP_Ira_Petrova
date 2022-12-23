package Sem2_dz2.entityes;

public class Product {
    private ProductNameEnum name;
    private int price;

    public Product(ProductNameEnum name, int price) {
        this.name = name;
        this.price = price;
    }

    public ProductNameEnum getName() {
        return name;
    }

    public void setName(ProductNameEnum name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
