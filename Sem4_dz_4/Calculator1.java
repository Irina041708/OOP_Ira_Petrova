// import java.lang.System.Logger;-не подходит!!!!!!!!!!!
import java.util.Scanner;
import java.io.IOException;

// Реализовать простой калькулятор (пользователь вводит 2 числа и вводит операцию (+ - / *)
// https://vertex-academy.com/tutorials/ru/konsolnyj-kalkulyator-java/
// К калькулятору из предыдущего дз добавить логирование.

public class Calculator1 {
    public static void main(String[] args) throws IOException {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        Integer numberA = iScanner.nextInt();
        System.out.print("Введите второе число: ");
        Integer numberB = iScanner.nextInt();
        System.out.print("Выберите и введите одну из операций '+','-','*','/':       ");
        Character operation = iScanner.next().charAt(0);
        Operation(numberA,numberB,operation);
        
        iScanner.close();
    }

    public static void Operation(int numberA,int numberB,char operation) {
        if(operation == '+'){
            int result = numberA + numberB;
            System.out.println(result);
            }
        else if(operation == '-'){
            int result = numberA - numberB;
            System.out.println(result);
            }
        else if(operation == '*'){
            int result = numberA * numberB;
            System.out.println(result);
            }
        else if(operation == '/'){
            double result = (double) numberA / numberB;
            System.out.printf("%.2f",result);
            }
        else
        System.out.println("Вы допустили ошибку при вводе операции. Попробуйте ещё раз"); 
    }
}
