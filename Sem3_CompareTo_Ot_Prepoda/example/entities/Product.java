package Sem3_CompareTo_Ot_Prepoda.example.entities;

public abstract class Product implements ComparableProduct {
    private final int id;
    private String name;
    private int price;

    private static int defaultIndex = 0;

    public Product(String name, int price) {
        this.id = defaultIndex++;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(ComparableProduct o) {
        return this.getAttractiveness().compareTo(o.getAttractiveness());
    }
}
