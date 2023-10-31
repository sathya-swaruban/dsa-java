package Assignments.ControlStructures.Iteration;
/*
TODO: problem description
*/
public class Assignment_05 {
    public static void main(String[] args) {
        int number = 371;
        int temp = number, temp2 = number, result = 0, n = 0;
        while (temp != 0) {
            n += 1;
            temp /= 10;
        }
        while (temp2 != 0) {
            int digit = temp2 % 10;
            result += Math.pow(digit, n);
            temp2 /= 10;
        }
        if (result == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}