package Sem2_dz2.serviceis;

import Sem2_dz2.entityes.Product;
import Sem2_dz2.entityes.MenuWaterNonCarbonzted;
import Sem2_dz2.entityes.WaterNonCarbonzted;
import Sem2_dz2.repository.ProductRepository;

import java.util.List;

public class WaterNonCarbonztedService {
    private ProductRepository repository;

    public WaterNonCarbonztedService(ProductRepository repository) {
        this.repository = repository;
    }

    public Integer getWaterNonCarbonztedPrice(WaterNonCarbonzted waterNonCarbonzted) {
        int price = 0;
        List<Product> products = repository.getAndDeleteProductByNames(waterNonCarbonzted.getListProducts());
        if (products.isEmpty()) return null;
        for (Product i : products) {
            price += i.getPrice();
        }
        return price;
    }

    public WaterNonCarbonzted getWaterNonCarbonztedByName(String name) {
        return MenuWaterNonCarbonzted.valueOf(name).getWaterNonCarbonzted();
    }
}
