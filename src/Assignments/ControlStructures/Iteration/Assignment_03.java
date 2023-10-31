package Assignments.ControlStructures.Iteration;
/*
TODO: problem description
*/
public class Assignment_03 {
    public static void main(String[] args) {
        int number = 2250, sum_of_digits = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum_of_digits += digit;
            temp /= 10;
        }
        if (number % sum_of_digits == 0) {
            System.out.println(number + " is divisible by sum of its digits");
        } else {
            System.out.println(number + " is not divisible by sum of its digits");
        }
    }
}