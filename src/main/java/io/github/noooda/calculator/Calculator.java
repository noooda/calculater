package io.github.noooda.calculator;

import java.util.Scanner;


public class Calculator {
    private final CalculatorView calculatorView;
    private final CalculatorLogic calculatorLogic;
    private double currentAns;
    private double currentNum;
    private String operator;

    public Calculator(CalculatorView calculatorView, CalculatorLogic calculatorLogic) {
        this.calculatorView = calculatorView;
        this.calculatorLogic = calculatorLogic;
        this.reset();
    }

    public void start() {
        System.out.println(calculatorView.startMessage());
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase("q")) {
                    break;
                } else if (input.equalsIgnoreCase("r")) {
                    this.reset();
                } else if (input.matches("[+\\-*/%]")) {
                    operator = input;
                } else if (input.matches("\\d+")) {
                    this.handleNumber(Integer.parseInt(input));
                } else {
                    System.out.println(calculatorView.requireNumOrOperator());
                }       
            }
        }
    }

    private void handleNumber(int num) {
        if (operator.isEmpty()) {
            currentNum = num;
        } else {
            this.calculate(num);
        }
    }

    private void calculate(int num) {
        try {
            currentAns = switch (operator) {
                case "+" -> calculatorLogic.add(this.currentNum, num, this.currentAns);
                case "-" -> calculatorLogic.subtract(this.currentNum, num, this.currentAns);
                case "*" -> calculatorLogic.multiply(this.currentNum, num, this.currentAns);
                case "/" -> calculatorLogic.divide(this.currentNum, num, this.currentAns);
                case "%" -> calculatorLogic.modulus(this.currentNum, num, this.currentAns);
                default -> throw new IllegalStateException("Unexpected operator: " + this.operator);
            };
            this.showResult();
        } catch (ArithmeticException e) {
            System.out.println(calculatorView.divideByZero());
        }
    }

    private void reset() {
        this.currentAns = 0;
        this.currentNum = 0;
        this.operator = "";
        System.out.println(calculatorView.resetMessage());
    }

    private void showResult() {
        this.operator = "";
        this.currentNum = 0;
        System.out.println(calculatorView.currentAnswer(this.currentAns));
    }
}