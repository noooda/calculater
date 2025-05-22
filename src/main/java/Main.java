import io.github.noooda.calculator.Calculator;
import io.github.noooda.calculator.CalculatorView;
import io.github.noooda.calculator.CalculatorLogic;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new CalculatorView(), new CalculatorLogic());
        calculator.start();
    }
}
