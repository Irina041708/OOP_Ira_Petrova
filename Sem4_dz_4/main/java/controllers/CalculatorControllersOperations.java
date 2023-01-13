package controllers;

import java.util.Scanner;

public class CalculatorControllersOperations {
    static Scanner scanner = new Scanner(System.in);
    public char operation;
    
    public char getOperation() {
        System.out.println("Введите операцию:");
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        }
        else {
            System.out.println("Вы совершили ошибку, попробуйте еще раз");
            scanner.next();// рекурсия
            operation = getOperation();
        }
        return operation;
        
    }
    
}
