package Assignments.ControlStructures.Selection;
/*
TODO: problem description
*/
public class Assignment_08 {
    public static void main(String[] args) {
        int number = 3;
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Zoom");
        } else if (number % 3 == 0) {
            System.out.println("Zip");
        } else if (number % 5 == 0) {
            System.out.println("Zap");
        } else {
            System.out.println("Invalid");
        }
    }
}