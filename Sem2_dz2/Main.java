package Sem2_dz2;

import Sem2_dz2.controller.VendingMachineController;
import Sem2_dz2.controller.VendingMachineControllerWaterNonCarbonzted;
import Sem2_dz2.entityes.Product;
import Sem2_dz2.entityes.ProductNameEnum;
import Sem2_dz2.repository.ProductRepository;
import Sem2_dz2.serviceis.HotDrinkService;
import Sem2_dz2.serviceis.WaterNonCarbonztedService;

import java.beans.Transient;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        ProductRepository productRepository = new ProductRepository();

        productRepository.addProduct(new Product(ProductNameEnum.LATTE, 110));
        productRepository.addProduct(new Product(ProductNameEnum.CAPPUCCINO, 150));
        productRepository.addProduct(new Product(ProductNameEnum.SUGAR, 40));
        productRepository.addProduct(new Product(ProductNameEnum.SUGAR, 40));
        productRepository.addProduct(new Product(ProductNameEnum.AQWA_1_L, 200));
        productRepository.addProduct(new Product(ProductNameEnum.BORJOMI_0_5_L, 160));
       

        HotDrinkService hotDrinkService = new HotDrinkService(productRepository);

        VendingMachineController vendingMachineController = new VendingMachineController( hotDrinkService);

        System.out.println(Arrays.toString(vendingMachineController.getMenu()));
        System.out.println(vendingMachineController.getHotDrink("CAPPUCCINO").getPrice());
        System.out.println(vendingMachineController.getHotDrink("LATTE").getPrice());
        System.out.println(vendingMachineController.getHotDrink("CAPPUCCINO").getError());


        WaterNonCarbonztedService WaterNonCarbonztedService = new WaterNonCarbonztedService(productRepository);

        VendingMachineControllerWaterNonCarbonzted vendingMachineControllerWaterNonCarbonzted = new VendingMachineControllerWaterNonCarbonzted( WaterNonCarbonztedService);

        System.out.println(Arrays.toString(vendingMachineControllerWaterNonCarbonzted.getMenu()));
        System.out.println(vendingMachineControllerWaterNonCarbonzted.getWaterNonCarbonzted("AQWA_1_L").getPrice());
        System.out.println(vendingMachineControllerWaterNonCarbonzted.getWaterNonCarbonzted("BORJOMI_0_5_L").getPrice());
        System.out.println(vendingMachineControllerWaterNonCarbonzted.getWaterNonCarbonzted("BORJOMI_0_5_L").getError());
        
    } 
    
}
