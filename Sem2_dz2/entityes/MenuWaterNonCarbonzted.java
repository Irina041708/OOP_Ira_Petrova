package Sem2_dz2.entityes;

public enum MenuWaterNonCarbonzted {
    AQWA_1_L(new Aqwa_1_L(), "Негазированная вода AQWA 1 литр"),
    BORJOMI_0_5_L(new Borjomi_0_5_L(), "Негазированная вода BORJOMI 0,5 литров");


    private final WaterNonCarbonzted waterNonCarbonzted;
    private final String name;

    MenuWaterNonCarbonzted(WaterNonCarbonzted waterNonCarbonzted, String name) {
        this.waterNonCarbonzted = waterNonCarbonzted;
        this.name = name;
    }

    public WaterNonCarbonzted getWaterNonCarbonzted() {
        return waterNonCarbonzted;
    }

    public String getName() {
        return name;
    }
}
