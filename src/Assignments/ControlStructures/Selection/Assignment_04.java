package Assignments.ControlStructures.Selection;
/*
TODO: problem description
*/
public class Assignment_04 {
    public static void main(String[] args) {
        char foodType = 'V';
        int quantity = 1, distance = 7;
        if ((foodType != 'N' && foodType != 'V') || distance < 0 || quantity < 1) {
            System.out.println(-1);
        } else {
            int billAmount = 0;
            if (foodType == 'V')
                billAmount += 12 * quantity;
            else if (foodType == 'N')
                billAmount += 15 * quantity;
            if (distance > 6)
                billAmount += 3 + ((distance - 6) * 2);
            else if (distance > 3)
                billAmount += distance;
            System.out.println(billAmount);
        }
    }
}