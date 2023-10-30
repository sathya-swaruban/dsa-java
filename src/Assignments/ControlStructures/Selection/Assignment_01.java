package Assignments.ControlStructures.Selection;
/*
Implement a program to display the sum of two given numbers if the numbers are same. If the numbers are not same,
display the double of the sum.

Example-01:
    Input:  number1 = 6, number2 = 5
    Output: 22

Example-01:
    Input:  number1 = 5, number2 = 5
    Output: 10
 */
public class Assignment_01 {
    public static void main(String[] args) {
        int number1 = 6, number2 = 5;
        int sum = number1 + number2;
        if (number1 == number2) {
            System.out.println(sum);
        } else {
            System.out.println(sum * 2);
        }
    }
}