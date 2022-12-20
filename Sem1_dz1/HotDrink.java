package Sem1_dz1;

public class HotDrink extends Product {
    private final int temperatura;

    public HotDrink(int price, String name,int temperatura) {
        super(price,name);
        this.temperatura = temperatura;
    }
    public int getTemperatura(){
        return temperatura;
    }

    @Override
    public String toString(){
        return "Горячий кофе {" +
        " temperature=" + temperatura +
        " price=" + getPrice() +
        " name=" + getName() +
        " }";
    }
}
