package Sem2_dz2.entityes;

public enum MenuHotDrink {
    LATTE(new Latte(), "Латте с сахаром"),
    CAPPUCCINO(new Cappuccino(), "Капучино с сахаром");


    private final HotDrink hotDrink;
    private final String name;

    MenuHotDrink(HotDrink hotDrink, String name) {
        this.hotDrink = hotDrink;
        this.name = name;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public String getName() {
        return name;
    }
}
