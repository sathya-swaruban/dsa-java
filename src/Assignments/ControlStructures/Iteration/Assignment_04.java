package Assignments.ControlStructures.Iteration;
/*
TODO: problem description
*/
public class Assignment_04 {
    public static void main(String[] args) {
        int number1 = 123, number2 = 738, result = 0;
        int temp = number1;
        while (temp != 0) {
            int digit = temp % 10;
            result += digit * number1;
            temp /= 10;
        }
        if (result == number2) {
            System.out.println(number1 + " is a seed of " + number2);
        } else {
            System.out.println(number1 + " is not a seed of " + number2);
        }
    }
}