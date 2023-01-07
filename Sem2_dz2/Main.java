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

        productRepository.addProduct(new Product(ProductNameEnum.LATTE, 150));
        productRepository.addProduct(new Product(ProductNameEnum.CAPPUCCINO, 250));
        productRepository.addProduct(new Product(ProductNameEnum.SUGAR, 40));
        productRepository.addProduct(new Product(ProductNameEnum.SUGAR, 40));
        productRepository.addProduct(new Product(ProductNameEnum.AQWA_1_L, 200));
        productRepository.addProduct(new Product(ProductNameEnum.BORJOMI_0_5_L, 160));
       

        HotDrinkService hotDrinkService = new HotDrinkService(productRepository);

        VendingMachineController vendingMachineController = new VendingMachineController( hotDrinkService);

        System.out.println(Arrays.toString(vendingMachineController.getMenu()));

        Integer CAPPUCCINO = vendingMachineController.getHotDrink("CAPPUCCINO").getPrice();
        Integer LATTE = vendingMachineController.getHotDrink("LATTE").getPrice();
        // String LATTE_ = vendingMachineController.getHotDrink("CAPPUCCINO").getError();

        // System.out.println("CAPPUCCINO" + "=" + CAPPUCCINO + " р.");
        // System.out.println("LATTE" + "=" + LATTE + " р.");
        // System.out.println("LATTE_" + "=" + LATTE_ + " р.");

        Integer AUTOMAT1 = LATTE.compareTo(CAPPUCCINO);
        if (AUTOMAT1 == -1) System.out.println("LATTE" + "=" + LATTE + " р.");
        if (AUTOMAT1 == 1) System.out.println("CAPPUCCINO" + "=" + CAPPUCCINO + " р.");
        if (AUTOMAT1 == 0) System.out.println("CAPPUCCINO" + "=" + "LATTE" + "=" + LATTE + " р.");

        System.out.println();

        WaterNonCarbonztedService WaterNonCarbonztedService = new WaterNonCarbonztedService(productRepository);

        VendingMachineControllerWaterNonCarbonzted vendingMachineControllerWaterNonCarbonzted = new VendingMachineControllerWaterNonCarbonzted( WaterNonCarbonztedService);

        System.out.println(Arrays.toString(vendingMachineControllerWaterNonCarbonzted.getMenu()));


        Integer AQWA_1_L = vendingMachineControllerWaterNonCarbonzted.getWaterNonCarbonzted("AQWA_1_L").getPrice();
        Integer BORJOMI_0_5_ = vendingMachineControllerWaterNonCarbonzted.getWaterNonCarbonzted("BORJOMI_0_5_L").getPrice();
        // String BORJOMI_0_5 = vendingMachineControllerWaterNonCarbonzted.getWaterNonCarbonzted("BORJOMI_0_5_L").getError();

        // System.out.println("AQWA_1_L" + "=" + AQWA_1_L + " р.");
        // System.out.println("BORJOMI_0_5_" + "=" + BORJOMI_0_5_ + " р.");
        // System.out.println("BORJOMI_0_5_" + "=" + BORJOMI_0_5);
      
        Integer AUTOMAT2 = AQWA_1_L.compareTo(BORJOMI_0_5_);
        if (AUTOMAT2 == -1) System.out.println("BORJOMI_0_5_" + "=" + BORJOMI_0_5_ + " р.");
        if (AUTOMAT2 == 1) System.out.println("AQWA_1_L" + "=" + AQWA_1_L + " р.");
        if (AUTOMAT2 == 0) System.out.println("BORJOMI_0_5_" + "=" +"AQWA_1_L" + "=" + AQWA_1_L + " р.");

    } 
    
}
