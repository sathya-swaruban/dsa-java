package Assignments;

public class Assignment_07 {
    public static void main(String[] args) {
        int  number1 = 7, number2 = 9;
        int lcm = (number1 * number2) / gcd(number1, number2);
        System.out.println("The LCM of " + number1 + " and " + number2 + " is " + lcm);
    }
    static int gcd(int number1, int number2) {
        while (number2 != 0) {
            int temp = number1;
            number1 = number2;
            number2 = temp % number1;
        }
        return number1;
    }
}