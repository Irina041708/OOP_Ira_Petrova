package entityes;

public class SumNumbers extends Numbers  {

    public  SumNumbers() {
    }
    @Override
    public Integer result() {
        
        return number1 + number2;
    }

    @Override
    public void setNumber1(Integer number) {
        super.number1 = number;
    }

    @Override
    public void setNumber2(Integer number) {
        super.number2 = number;
    }
}
