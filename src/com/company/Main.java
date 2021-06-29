package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(minOrMax(0.2322,0.02322,"max"));

    }
    public static double minOrMax(double firstNumber, double secondNumber, String operator) {
        double answer = 0;

        switch (operator) {
            case "min":
                answer = Math.min(firstNumber, secondNumber);
                return answer;
            case "max":
                answer = Math.max(firstNumber, secondNumber);
                return answer;
            default:
                System.out.println("Enter a valid operator");
                return answer;
        }
    }
}
