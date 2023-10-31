package Assignments.ControlStructures.Iteration;
/*
TODO: problem description
*/
public class Assignment_02 {
    public static void main(String[] args) {
        int heads = 3, legs = 500;
        if (heads > legs || legs % 2 != 0) {
            System.out.println("The number of chickens and rabbits cannot be found");
        } else {
            int rabbits = (int) (legs - 2 * heads) / 2;
            int chickens = heads - rabbits;
            System.out.println("Chickens=" + chickens);
            System.out.println("Rabbits=" + rabbits);
        }
    }
}