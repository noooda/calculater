package io.github.noooda.calculator;

import java.util.Scanner;


public class Calculator {
    int ans;
    int num;
    String operator;

    public Calculator() {
        this.ans = 0;
        this.num = 0;
        this.operator = "";
    }

    public void start() {
        System.out.println("Enter \"q\" to quit.");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            if (input.matches("\\d+")) {
                this.num = Integer.parseInt(input);

                if (this.operator.isEmpty()) {
                    this.ans = this.num;
                } else {
                    switch (this.operator) {
                        case "+":
                            this.ans += this.num;
                            break;
                        case "-":
                            this.ans -= this.num;
                            break;
                        case "*":
                            this.ans *= this.num;
                            break;
                        case "/":
                            if (this.num != 0) {
                                this.ans /= this.num;
                            } else {
                                System.out.println("Cannot divide by zero.");
                            }
                            break;
                        case "%":
                            this.ans %= this.num;
                            break;
                    }

                    this.operator = "";
                    System.out.println("Current result: " + this.ans);
                }
            }

            if (input.matches("[+\\-*/%]")) {
                this.operator = input;
            }
        }

        scanner.close();
    }
}