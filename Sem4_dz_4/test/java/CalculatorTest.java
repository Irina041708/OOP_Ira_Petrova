import services.CalculatorService;

public class CalculatorTest {

    @Test
    public void sumWhenTypeIsInteger(){
        CalculatorService<Integer> service = new CalculatorService<>();

        assertEquals(service.result(1, 2), 3);
    }

    // @Test
    // public void sumWhenBothNumberIsNull(){
    //     CalculatorService<Integer> service = new CalculatorService<>();

    //     assertEquals(service.sum(null, null), 0);
    // }

}
// public double sum(T[] num1, T[] num2) {
    //     if(num1 == null || num2 == null) { return 0; }
    //     return num1.doubleValue() + num2.doubleValue();
    // }
    //https://yandex.ru/video/preview/18193161785624440309 