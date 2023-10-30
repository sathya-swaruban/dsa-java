package Assignments.ControlStructures.Iteration;
/*
Implement a program to find and display the least common multiple (LCM) of two whole numbers.

Least Common Multiple (LCM) of two numbers, num1 and num2 is the smallest positive number that is divisible by both
num1 and num2.

Example:
    Input:  7 and 9
    Output: 63
 */
public class Assignment_07 {
    public static void main(String[] args) {
        int  number1 = 7, number2 = 9;
        int lcm = (number1 * number2) / gcd(number1, number2);
        System.out.println(lcm);
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