package Sem3_CompareTo_Ot_Prepoda.example;

import Sem3_CompareTo_Ot_Prepoda.example.entities.HotDrink;
import Sem3_CompareTo_Ot_Prepoda.example.entities.Product;
import Sem3_CompareTo_Ot_Prepoda.example.entities.Snack;

public class Main {
    public static void main(String[] args) {
        Product hotDrink = new HotDrink("1", 10, 100);
        Product snack = new Snack("2", 1, 1000);
        System.out.println(hotDrink.compareTo(snack));
    }
}