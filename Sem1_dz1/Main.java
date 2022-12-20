package Sem1_dz1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> bottleOfWaters = new ArrayList<>();
        bottleOfWaters.add(new BottleOfWater(1, "1", 1));
        bottleOfWaters.add(new BottleOfWater(2, "2", 2));
        bottleOfWaters.add(new BottleOfWater(3, "3", 3));

        WaterVendingMachine WaterWendingMachine = new WaterVendingMachine(1, bottleOfWaters);
        System.out.println(WaterWendingMachine.getProduct("1", 1));
        System.out.println(WaterWendingMachine.getProduct("3"));
        System.out.println(WaterWendingMachine.getProduct("2", 1));

        ArrayList<Product> HotDrink = new ArrayList<>();
        HotDrink.add(new HotDrink(150, "Американо", 40));
        HotDrink.add(new HotDrink(200, "Latte", 60));
       

        WaterVendingMachine HotDrinkVendingMachine1 = new WaterVendingMachine(1, HotDrink);
        System.out.println(HotDrinkVendingMachine1.getProduct("Американо", 150));
        System.out.println(HotDrinkVendingMachine1.getProduct("Latte", 200));

        
        
    }


}
