package Assignments.ControlStructures.Selection;
/*
Implement a program to calculate the product of three positive integer values. However, if one of the integers is 7,
consider only the values to the right of 7 for calculation. If 7 is the last integer, then display -1.

Note: Only one of the three values can be 7.

Example-01:
    Input:  num1 = 1, num2 = 5, num3 = 3
    Output: 15

Example-02:
    Input:  num1 = 3, num2 = 7, num3 = 8
    Output: 8

Example-03:
    Input:  num1 = 7, num2 = 2, num3 = 9
    Output: 18

Example-04:
    Input:  num1 = 2, num2 = 6, num3 = 7
    Output: -1
*/
public class Assignment_03 {
    public static void main(String[] args) {
        int num1 = 1, num2 = 5, num3 = 3;
        if (num3 == 7)
            System.out.println(-1);
        else if (num2 == 7)
            System.out.println(num3);
        else if (num1 == 7)
            System.out.println(num2 * num3);
        else
            System.out.println(num1 * num2 * num3);
    }
}