package io.github.noooda.calculator;

public class CalculatorLogic {
    private double checkCurrentNum(double currentNum, double currentAns) {
        return currentNum == 0 ? currentAns : currentNum;
    }

    public double add(double currentNum, double num, double currentAns) {
        return this.checkCurrentNum(currentNum, currentAns) + num;
    }

    public double subtract(double currentNum, double num, double currentAns) {
        return this.checkCurrentNum(currentNum, currentAns) - num;
    }

    public double multiply(double currentNum, double num, double currentAns) {
        return this.checkCurrentNum(currentNum, currentAns) * num;
    }

    public double divide(double currentNum, double num, double currentAns) {
        if (num == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return this.checkCurrentNum(currentNum, currentAns) / num;
    }

    public double modulus(double currentNum, double num, double currentAns) {
        return this.checkCurrentNum(currentNum, currentAns) % num;
    }
}
