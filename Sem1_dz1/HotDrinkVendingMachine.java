package Sem1_dz1;

import java.util.ArrayList;

public class HotDrinkVendingMachine extends VendingMachine{
    
    public HotDrinkVendingMachine (Integer id, ArrayList<Product> products) {
        super(id, products);
    }
    public HotDrinkVendingMachine(Integer id) {
        super(id);
    }
    public Product getProduct(String name, Integer price, Integer temperaturas) {
        for (Product p : getProducts())
            if (p instanceof HotDrink && p.getName().equals(name) && p.getPrice().equals(price) && ((HotDrink)p).getTemperatura() == temperaturas)
                return p;
        return null;
    }

}
