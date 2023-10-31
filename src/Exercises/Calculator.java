package Exercises;

class Calculator {
    public double findAverage(int number1, int number2, int number3) {
        double average = (double) (number1 + number2 + number3) / 3.0;
        return Math.round(average * 100.0) / 100.0;
    }
}

class Tester2 {
    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        double result = calculator.findAverage(12, 8, 15);
        System.out.println(result);
    }
}