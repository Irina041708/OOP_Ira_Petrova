package Sem2_dz2.serviceis;

import Sem2_dz2.entityes.Product;
import Sem2_dz2.entityes.Menu;
import Sem2_dz2.entityes.HotDrink;
import Sem2_dz2.repository.ProductRepository;

import java.util.List;

public class HotDrinkService {
    private ProductRepository repository;

    public HotDrinkService(ProductRepository repository) {
        this.repository = repository;
    }

    public Integer getHotDrinkPrice(HotDrink hotDrink) {
        int price = 0;
        List<Product> products = repository.getAndDeleteProductByNames(hotDrink.getListProducts());
        if (products.isEmpty()) return null;
        for (Product i : products) {
            price += i.getPrice();
        }
        return price;
    }

    public HotDrink getHotDrinkByName(String name) {
        return Menu.valueOf(name).getHotDrink();
    }
}
