package services;

import controllers.CalculatorControllersNumbers;
import entityes.Calculater;

public class CalculatorService<T extends Number> {
    CalculatorControllersNumbers CalculatorControllersNumbers;//что принимаем от пользователя
    Calculater Calculater;// наша модель

    public CalculatorService(Calculater m, CalculatorControllersNumbers v) {
        Calculater = m;
        CalculatorControllersNumbers = v;
    }

    public CalculatorService(Object m, controllers.CalculatorControllersNumbers v) {
    }

    public void buttonClick(){
        Integer number1 = CalculatorControllersNumbers.getCalculatorControllersNumbers("number1: ");
        Integer number2 = CalculatorControllersNumbers.getCalculatorControllersNumbers("number2: ");
        Calculater.setNumber1(number1);
        Calculater.setNumber2(number2);
        Integer result = Calculater.result();
        CalculatorControllersNumbers.print(result, "Summa: ");
    }
}


    

    // public double sum(T[] num1, T[] num2) {
    //     if(num1 == null || num2 == null) { return 0; }
    //     return num1.doubleValue() + num2.doubleValue();
    // }
        //!!!Так можем
        // Integer num = 1;
        // Number n = num;

        //!!! Но не можем вот так. Дженерики не подвержены такому преобразованию!!!
        //Так как это абсолютно разные массивы, с абсолютно разным размером, формой,
        
        // ArrayList<Integer> arr = new ArrayList<>();
        // ArrayList<Number> nums = arr;

        // !!! Но можем делать так, с помощью массивов
        // Integer[] n = new Integer[5];
        // Number[] k1 = n;
        // Number[] k2 = n;
        
    // }

    // public double multiply(T num1, T num2) {
    //     return num1.doubleValue() * num2.doubleValue();
    // }

