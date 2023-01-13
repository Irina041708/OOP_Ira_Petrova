package Ex001Calc;

public class Program {
    public static void main(String[] args) {
        PresenterOfT p = new PresenterOfT(new SumModel(), new View());
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();

    }
}
