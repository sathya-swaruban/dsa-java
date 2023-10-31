package Assignments.ControlStructures.Selection;
/*
TODO: problem description
*/
public class Assignment_07 {
    public static void main(String[] args) {
        int day = 31, month = 11, year = 15;
        if (day == 31 && month == 12) {
            day = 1;
            month = 1;
            year++;
        } else {
            if (day == 31) {
                day = 1;
                month++;
            } else {
                day++;
            }
        }
        String date = day + "-" + month + "-" + year;
        System.out.println(date);
    }
}