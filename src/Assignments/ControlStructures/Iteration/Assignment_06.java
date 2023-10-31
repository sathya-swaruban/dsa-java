package Assignments.ControlStructures.Iteration;
/*
TODO: problem description
*/
public class Assignment_06 {
    public static void main(String[] args) {
        int number = 1623, index = 0, sum_of_squares = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            if (index % 2 == 0) {
                sum_of_squares += digit * digit;
            }
            temp /= 10;
            index++;
        }
        if (sum_of_squares % 9 == 0) {
            System.out.println("The number " + number + " is a lucky number");
        } else {
            System.out.println("The number is not a lucky number");
        }
    }
}