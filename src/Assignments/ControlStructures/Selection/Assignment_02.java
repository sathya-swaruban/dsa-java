package Assignments.ControlStructures.Selection;
/*
Quadratic equation is an equation with degree 2 in the form of ax^2 + bx + c = 0 where a, b and c are the coefficients.
Implement a program to solve a quadratic equation.

    a. Find the discriminant value using the following formula:  discriminant = b^2 - 4ac
    b. If the discriminant is 0, the values of both the roots will be same. Display the value of the root.
    c. If the discriminant is greater than 0, the roots will be unequal real roots. Display the values of both the roots.
    d. If the discriminant is less than 0, there will be no real roots. Display the message "The equation has no real root"
    e. Use the following formula to find the roots of a quadratic equation:  x = (-b ± discriminant)/2a

Example-01:
    Input:  a = 1, b = 4, c = 4
    Output: The root is -2.0

Example-01:
    Input:  a = 1, b = 4, c = 6
    Output: The equation has no real root
 */
public class Assignment_02 {
    public static void main(String[] args) {
        int a = 1, b = 4, c = 6;
        double discriminant = Math.pow(b, 2) - (4 * a * c);
        double root1 = (-b + discriminant) / 2 * a;
        double root2 = (-b - discriminant) / 2 * a;
        if (discriminant == 0) {
            System.out.println("The root is " + root1);
        } else if (discriminant > 0) {
            System.out.println("The roots are " + root1 + " and " + root2);
        } else {
            System.out.println("The equation has no real root");
        }
    }
}