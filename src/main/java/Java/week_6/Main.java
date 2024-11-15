package Java.week_6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(1);
        intList.add(4);
        intList.add(2);
        // Sort by natural order
        GenericSorting.sort(intList, Comparator.naturalOrder());
        System.out.println("Sorted integer list: " + intList);


        List<String> stringList = new ArrayList<>();
        stringList.add("Charlie");
        stringList.add("Alice");
        stringList.add("Bob");
        // Sort by custom comparator (e.g., descending order)
        GenericSorting.sort(stringList, Comparator.comparing(String::length).reversed());
        System.out.println("Sorted string list (descending order): " + stringList);
    }
}