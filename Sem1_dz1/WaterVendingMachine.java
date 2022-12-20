package Sem1_dz1;

import java.util.ArrayList;


public class WaterVendingMachine extends VendingMachine {

    public WaterVendingMachine(Integer id, ArrayList<Product> products) {
        super(id, products);
    }
    public WaterVendingMachine(Integer id) {
        super(id);
    }
    public char[] voice(String string, int i) {
        return null;
    }

    public Product getProduct(String name, Integer price, Integer liters) {
        for (Product p : getProducts())
            if (p instanceof BottleOfWater && p.getName().equals(name) && p.getPrice().equals(price) && ((BottleOfWater)p).getLiters() == liters)
                return p;
        return null;
    }
}
