import java.util.Scanner;

// https://yandex.ru/video/preview/10074719283859320216 - по видео разбивка

public class Calculator2 {
    static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
        // new CalculatorController_();
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат операции: " + result);
        }

    public static int getInt() {
        System.out.println("Введите число");
        int num;
        //Делаем проверку
        if(scanner.hasNextInt()){//если сканер принял число
        num = scanner.nextInt();
        }
        else{
        System.out.println("Вы сершили ошибку, попробуйте ещё раз!");
        scanner.next();//рекурсия, чтобы метод не останавливался во время ошибки ввода
        //сканнер опять будет принимать чилсло,которое мы будем вводить
        num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
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

    public static int calc (int num1, int num2, char operation)  {
        int result;
        switch (operation) {
        case '+': 
            result = num1 + num2;
            break;
        case '-': 
            result = num1 - num2;
            break;
        case '*': 
            result = num1 * num2;
            break;
        case '/': 
            result = num1 / num2;
            break;  
        default: //если пользователь ввел все, кроме этих значений
            System.out.println("Операция не прошла, проверьте корректность ввода");
            result = calc(num1, num2, getOperation());//рекурсия,если ввели что то не правиьно, он попросит нас ввести еще раз
        } 
        return result;
    }
}
// int getInt - сичтывает число и возвращает его
// char getOperation - считывет операцию
// int calc - работа с getInt и с getOperation 
// main - работа с предыдущими методами
