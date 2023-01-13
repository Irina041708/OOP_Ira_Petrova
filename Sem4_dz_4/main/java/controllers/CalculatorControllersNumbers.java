package controllers;

import java.util.Scanner;
//Получаем данные от пользователя
public class CalculatorControllersNumbers {
    // public Number numbers;
    public Scanner scanner = new Scanner(System.in);
    // public Integer n = scanner.nextInt();
    
    public Integer getCalculatorControllersNumbers(String title) {
        System.out.printf("%s", title);
        return scanner.nextInt();

        // System.out.println("Введите число: ");
        // //Делаем проверку
        // Number num;
        // if(scanner.hasNextDouble()){//если сканер принял число
        //     num = scanner.nextDouble();
        //     numbers = num;
        //     return numbers;
        // }
        // else {
        //     System.out.println("Вы совершили ошибку при вводе, попробуйте ещё раз!");
        // }
        // return numbers;
    } 
    
    public void print(Integer result, String title) {
        System.out.printf("%s %d\n", title, result);
    }
}
// https://www.youtube.com/watch?v=R_yZfLdApro
//https://www.examclouds.com/ru/java/java-core-russian/generics-russian
// public class Average<T extends Number> {
//     private T[] array;

//     public Average(T[] array) {
//         this.array = array;
//     }

//     public double average() {
//         double sum = 0.0;

//         for (T value : array) {
//             sum += value.doubleValue();
//         }

//         return sum / array.length;
//     }
// }