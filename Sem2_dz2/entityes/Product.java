package Sem2_dz2.entityes;

public class Product implements Comparable<Product> {
    private ProductNameEnum name;
    private Integer price;

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

    @Override
        public int compareTo(Product o){
        return this.price.compareTo(o.price);
    }

}
