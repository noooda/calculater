package io.github.noooda.calculator;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Calculator {
    List<Integer> nums;
    List<String> ops;

    public Calculator() {
        this.nums = new ArrayList<>();
        this.ops = new ArrayList<>();
        System.out.println(this.nums);
        System.out.println(this.ops);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'exit' to quit.");
        while (true) {
            System.out.print("Enter an expression: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println(input);
                break;
            }
        }
        scanner.close();
    }
}