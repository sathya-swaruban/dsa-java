package Assignments.TypeConversion;
/*
Implement a program to convert temperature from Fahrenheit to Celsius degree by using the formula given below and
display the converted value.

    C = ((F - 32) / 9) * 5 where, C represents temperature in Celsius and F represents temperature in Fahrenheit.

Example-01:
    Input:  32
    Output: 0.0

Example-02:
    Input:  50
    Output: 10.0
*/
public class Assignment_02 {
    public static void main(String[] args) {
        int fahrenheit = 50;
        double celcius = ((double) (fahrenheit - 32) / 9) * 5;
        System.out.println(celcius);
    }
}