package Collections;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Black");
        myList.add("Red");
        myList.add("Blue");
        myList.add("Green");

        myList.add(1, "White");     // Adds the element "White" at the 2nd position (index 1)

        myList.forEach(System.out::println);
    }
}