package Assignments;
/*
Implement a program to display the below pattern.
    *****
    ****
    ***
    **
    *
*/
public class Assignment_08 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}