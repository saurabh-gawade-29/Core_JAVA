package Lecture6;
//You can create multiple objects of one class:
public class MultipleObject {
    int x = 5;

    public static void main(String[] args) {
        MultipleObject myObj1 = new MultipleObject();  // Object 1
        MultipleObject myObj2 = new MultipleObject();  // Object 2
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
