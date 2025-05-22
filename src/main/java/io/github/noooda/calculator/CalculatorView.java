package io.github.noooda.calculator;

public class CalculatorView {
    private final String[] operators = {"+", "-", "*", "/", "%"};
    private final String exitKey = "q";
    private final String resetKey = "r";

    public String startMessage() {
        return String.format(
            "\nThis calculator supports the following operations:\n\n| %s |\n\nEnter \"%s\" to reset.\nEnter \"%s\" to quit.\n",
            String.join(" | ", operators), resetKey, exitKey
        );
    }

    public String resetMessage() {
        return "\nCalculator reset.\n";
    }

    public String currentAnswer(double ans) {
        return String.format("\nCurrent answer: %s\n", ans);
    }

    public String requireNumOrOperator() {
        return "\nPlease enter a number or a supported operator.\n";
    }

    public String divideByZero() {
        return "\nError: Division by zero is not allowed.\n";
    }
}
