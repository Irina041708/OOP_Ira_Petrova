package Sem1_dz1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> bottleOfWaters = new ArrayList<>();
        bottleOfWaters.add(new BottleOfWater(1, "1", 1));
        bottleOfWaters.add(new BottleOfWater(2, "2", 6));
        bottleOfWaters.add(new BottleOfWater(3, "3", 3));

        WaterVendingMachine BottleWaterWendingMachine = new WaterVendingMachine(1, bottleOfWaters);
        System.out.println(BottleWaterWendingMachine.getProduct("1", 1));
        System.out.println(BottleWaterWendingMachine.getProduct("3"));
        System.out.println(BottleWaterWendingMachine.getProduct("2", 2,6));


        ArrayList<Product> HotDrink = new ArrayList<>();
        HotDrink.add(new HotDrink(150, "Американо", 40));
        HotDrink.add(new HotDrink(200, "Latte", 60));
        
       
        HotDrinkVendingMachine HotDrinkVendingMachine = new HotDrinkVendingMachine(1, HotDrink);
        System.out.println(HotDrinkVendingMachine.getProduct("Американо", 150));
        System.out.println(HotDrinkVendingMachine.getProduct("Latte", 200));
        System.out.println(HotDrinkVendingMachine.getProduct("Американо", 150,40));
        System.out.println(HotDrinkVendingMachine.getProduct("Latte", 150,40));

        

        
        
    }


}
