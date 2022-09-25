package Lecture25;

import java.util.*;

class MapExample3 {
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
                .sorted(Map.Entry.comparingByKey())
                //Performs an action for each element of this stream
                .forEach(System.out::println);
    }
// TODO:
//    When and how to use double colon operator?
//    Method reference or double colon operator can be used to refer:
//    a static method,
//    an instance method, or
//    a constructor.
}
