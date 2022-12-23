package Sem2_dz2;

import Sem2_dz2.controller.VendingMachineController;
import Sem2_dz2.entityes.Product;
import Sem2_dz2.entityes.ProductNameEnum;
import Sem2_dz2.repository.ProductRepository;
import Sem2_dz2.serviceis.HotDrinkService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        ProductRepository productRepository = new ProductRepository();

        productRepository.addProduct(new Product(ProductNameEnum.LATTE, 110));
        productRepository.addProduct(new Product(ProductNameEnum.CAPPUCCINO, 150));
        productRepository.addProduct(new Product(ProductNameEnum.SUGAR, 40));
        productRepository.addProduct(new Product(ProductNameEnum.SUGAR, 40));
       

        HotDrinkService hotDrinkService = new HotDrinkService(productRepository);

        VendingMachineController vendingMachineController = new VendingMachineController( hotDrinkService);

        System.out.println(Arrays.toString(vendingMachineController.getMenu()));
        System.out.println(vendingMachineController.getHotDrink("CAPPUCCINO").getPrice());
        System.out.println(vendingMachineController.getHotDrink("LATTE").getPrice());
        System.out.println(vendingMachineController.getHotDrink("CAPPUCCINO").getError());
        
    } 
}
