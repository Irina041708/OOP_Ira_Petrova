package Sem2_dz2.controller;

import Sem2_dz2.entityes.MenuWaterNonCarbonzted;
import Sem2_dz2.entityes.WaterNonCarbonzted;
import Sem2_dz2.serviceis.WaterNonCarbonztedService;
import Sem2_dz2.view.GetWaterNonCarbonztedResponse;

public class VendingMachineControllerWaterNonCarbonzted {

    private final WaterNonCarbonztedService waterNonCarbonztedService;

    public VendingMachineControllerWaterNonCarbonzted( WaterNonCarbonztedService waterNonCarbonztedService) {
       
        this.waterNonCarbonztedService = waterNonCarbonztedService;
    }

    
    public MenuWaterNonCarbonzted[] getMenu() {
        return MenuWaterNonCarbonzted.values();
    }

    public GetWaterNonCarbonztedResponse getWaterNonCarbonzted(String waterNonCarbonztedName) {
        WaterNonCarbonzted waterNonCarbonzted = waterNonCarbonztedService.getWaterNonCarbonztedByName(waterNonCarbonztedName);
        Integer price = waterNonCarbonztedService.getWaterNonCarbonztedPrice(waterNonCarbonzted);
        if (price == null) return new GetWaterNonCarbonztedResponse("Данный продукт в автомате отсутствует");
        return new GetWaterNonCarbonztedResponse(waterNonCarbonztedName, price);
    }
}
