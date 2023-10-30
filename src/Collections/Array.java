package Collections;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        /*
         Declaration and Initialization of an Array.
         */
        String[] colors = new String[5];                // Declaration
        colors[0] = "Black";                            // Initialization
        colors[1] = "White";
        colors[2] = "Red";
        colors[3] = "Blue";
        colors[4] = "Green";

        int[] numbers = {1, 2, 3, 4, 5};                // Declaration + Initialization

        /*
         Accessing the array elements using various methods.
         */
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        // Looping through the arrays using a for loop
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        // Looping through the arrays using a reversed for loop
        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

        // Looping through the arrays using a while loop
        int i = 0;
        while (i < colors.length) {
            System.out.println(colors[i]);
            i++;
        }

        // Looping through the arrays using a for-each loop
        for (String color : colors) {
            System.out.println(color);
        }

        // Looping through the arrays using the Arrays class's toString() method
        System.out.println(Arrays.toString(numbers));

        // Looping through the arrays using the Arrays class's stream() method
        Arrays.stream(numbers).forEach(System.out::println);
    }
}