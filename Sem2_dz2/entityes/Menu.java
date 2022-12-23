package Sem2_dz2.entityes;

public enum Menu {
    LATTE(new Latte(), "Латте"),
    CAPPUCCINO(new Cappuccino(), "Капучино");

    private final HotDrink hotDrink;
    private final String name;

    Menu(HotDrink hotDrink, String name) {
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
