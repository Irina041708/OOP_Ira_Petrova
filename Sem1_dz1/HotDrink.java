package Sem1_dz1;

import java.util.ArrayList;

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

    public void overloaded(int repeat) {
        for(int i = 0; i < repeat; i++){this.getTemperatura();}
    }

}
