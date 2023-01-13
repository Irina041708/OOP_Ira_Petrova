package Sem3_CompareTo_Ot_Prepoda.example.entities;

public class HotDrink extends Product{

    private Integer temperature;

    public HotDrink(String name, int price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    @Override
    public Double getAttractiveness() {
        return Double.valueOf(temperature);
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }
}
