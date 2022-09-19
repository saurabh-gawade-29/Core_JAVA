package Lecture23;

public class BeforeGenericMethod {

    public void printArry(String[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    public void printArry(Integer[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }

    public static void main(String[] args) {
        BeforeGenericMethod obj1 = new BeforeGenericMethod();
        String names[] = new String[]{"saurabh", "swapnil" };
        Integer rollno[] = {10, 20};
        obj1.printArry(names);
        obj1.printArry(rollno);
    }
}
