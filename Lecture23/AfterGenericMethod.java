package Lecture23;

public class AfterGenericMethod {
    public <T> void printArry1(T[] s) {
//        for (int i = 0; i < s.length; i++) {
//            System.out.println(s[i]);
//        }
        for(T i:s ){
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        AfterGenericMethod obj1 = new AfterGenericMethod();
        String names[] = new String[]{"saurabh", "swapnil" };
        Integer rollno[] = {10, 20};
        obj1.printArry1(names);
        obj1.printArry1(rollno);
    }
}
