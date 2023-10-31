package Assignments.ControlStructures.Iteration;
/*
TODO: problem description
*/
public class Assignment_01 {
    public static void main(String[] args) {
        int number = 1331, reversed = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            reversed = digit + reversed * 10;
            temp /= 10;
        }
        if (number == reversed) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
}