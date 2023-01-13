import controllers.CalculatorControllersNumbers;
import entityes.SumNumbers;
import services.CalculatorService;

// https://yandex.ru/video/preview/10074719283859320216
// https://www.youtube.com/watch?v=dsKYZWjQPEI
// Реализуйте программу для умножения массивов с использованием MVC и напишите к ней Unit тесты.
//https://www.youtube.com/watch?v=ayUbY2sB-IU - что мне помогло
public class Main {
  public static void main(String []args) {
    CalculatorService p = new CalculatorService(new SumNumbers(), new CalculatorControllersNumbers());
    p.buttonClick();
  }
}
// int getInt - сичтывает число и возвращает его
// char getOperation - считывет операцию
// int calc - работа с getInt и с getOperation 
// main - работа с предыдущими методами
