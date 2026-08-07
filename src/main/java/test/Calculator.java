package test;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public String classify(int value) {
        if (value > 0) {
            return "positive";
        }
        if (value == 0) {
            return "zero";
        }
        return "negative";
    }
}