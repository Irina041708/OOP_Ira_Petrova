package Sem2_dz2.entityes;

import java.util.Arrays;
import java.util.List;

import static Sem2_dz2.entityes.ProductNameEnum.*;

public class Aqwa_1_L implements WaterNonCarbonzted {
    private static List<ProductNameEnum> listOfProducts = Arrays.asList(
        AQWA_1_L
    );

    @Override
    public List<ProductNameEnum> getListProducts() {
        return listOfProducts;
    }


    public static void setListOfProducts(List<ProductNameEnum> Products) {
        listOfProducts = Products;
    }
}

