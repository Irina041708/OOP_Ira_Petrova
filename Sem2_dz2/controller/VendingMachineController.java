package Sem2_dz2.controller;

import Sem2_dz2.entityes.Menu;
import Sem2_dz2.entityes.HotDrink;
// import Sem2_dz2.serviceis.DoughServices;
import Sem2_dz2.serviceis.HotDrinkService;
// import Sem2_dz2.view.GetDoughByNameResponse;
import Sem2_dz2.view.GetHotDrinkResponse;

public class VendingMachineController {

    // private final DoughServices doughServices;
    private final HotDrinkService hotDrinkService;

    public VendingMachineController( HotDrinkService hotDrinkService) {
       
        this.hotDrinkService = hotDrinkService;
    }

    // public GetDoughByNameResponse getDough(String name) {
    //     return doughServices.getDoughByName(name);
    // }

    public Menu[] getMenu() {
        return Menu.values();
    }

    public GetHotDrinkResponse getHotDrink(String hotDrinkName) {
        HotDrink hotDrink = hotDrinkService.getHotDrinkByName(hotDrinkName);
        Integer price = hotDrinkService.getHotDrinkPrice(hotDrink);
        if (price == null) return new GetHotDrinkResponse("Данный продукт в автомате отсутствует");
        return new GetHotDrinkResponse(hotDrinkName, price);
    }
}
