package Sem3_CompareTo_Ot_Prepoda.example.entities;

public class Snack extends Product{

    private Integer nutritionalValue;

    public Snack(String name, int price, int nutritionalValue) {
        super(name, price);
        this.nutritionalValue = nutritionalValue;
    }

    @Override
    public Double getAttractiveness() {
        return Double.valueOf(nutritionalValue);
    }

    public Integer getNutritionalValue() {
        return nutritionalValue;
    }

    public void setNutritionalValue(Integer nutritionalValue) {
        this.nutritionalValue = nutritionalValue;
    }
}
