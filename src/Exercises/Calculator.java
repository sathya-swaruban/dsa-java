package Exercises;

class Calculator {

    public int num;

    public int sumOfDigits() {
        int sum = 0;
        int temp = this.num;
        while (temp != 0) {
            int remainder = temp % 10;
            sum += remainder;
            temp = temp / 10;
        }
        return sum;
    }

    public double findAverage(int number1, int number2, int number3) {
        double average = (double) (number1 + number2 + number3) / 3.0;
        return Math.round(average * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.num = 6547;
        System.out.println(calculator.sumOfDigits());
        System.out.println(calculator.findAverage(12, 8, 15));
    }
}
