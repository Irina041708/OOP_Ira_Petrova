package Sem1_dz1;

import java.util.ArrayList;

public abstract class Product {
    private Integer price;
    private String name;

    public Product(Integer price, String name2) {
        this.price = price;
        this.name = name2;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Я неизвестный продукт";
    }
}
