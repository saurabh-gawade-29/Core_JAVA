package Lecture25;

import java.util.*;

//TODO: Java Map Example: comparingByValue()
class MapExample5 {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        //Returns a Set view of the mappings contained in this map
        map.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByValue())
                //Performs an action for each element of this stream
                .forEach(System.out::println);
    }
}
